package ensoCosmosQuiz.services;


import ensoCosmosQuiz.models.Movie;
import org.apache.tinkerpop.gremlin.driver.Client;
import org.apache.tinkerpop.gremlin.driver.Cluster;
import org.apache.tinkerpop.gremlin.driver.Result;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
public class GraphService {
    Cluster cluster;
    Client client;

    public Client getClient(){
        if(client == null) {
            try {
                String file = getClass().getClassLoader().getResource("remote.yaml").getPath();
                cluster = Cluster.build(new File(file)).create();
                client = cluster.connect();
            } catch (Exception e) {
                System.out.println("Couldn't find the configuration file.");
            }
        }
        return client;
    }

    public String save(Movie movie){
        Result result = getClient().submit("g.addV('movie').property('id','" + movie.getId() + "').property('title','" + movie.getOriginal_title() + "')").one();
        System.out.println("\nQuery result:");
        System.out.println(result.toString());
        return result.toString();
    }

    public String get(String id){
        try {
            Result result = getClient().submit("g.V('" + id + "')").one();
            System.out.println("\nQuery result:");
            System.out.println(result.toString());
            return result.toString();
        } catch (Exception e){
            return e.getMessage();
        }
    }

    public List<Result> getAll(){
        try {
            CompletableFuture<List<Result>> completableFutureResults = getClient().submit("g.V()").all();
            List<Result> resultList = completableFutureResults.get();
            for (Result result : resultList) {
                System.out.println("\nQuery result:");
                System.out.println(result.toString());
            }
            return resultList;
        } catch (Exception e){
            return new ArrayList<>();
        }
    }
}
