package ensoCosmosQuiz.controllers;

import ensoCosmosQuiz.repository.MovieRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MovieController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @Autowired
    private MovieRepository repository;

    @RequestMapping(method = GET, path = "/getNumberOfActorsInBladeRunner")
    public int getNumberOfActorsInBladeRunner() {
        // Le code
        return 0;
    }
}
