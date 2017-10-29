package ensoCosmosQuiz.repository;

import ensoCosmosQuiz.models.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String> {
}
