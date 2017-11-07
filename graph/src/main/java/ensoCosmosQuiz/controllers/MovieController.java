package ensoCosmosQuiz.controllers;

import ensoCosmosQuiz.models.Movie;
import ensoCosmosQuiz.services.GraphService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class MovieController {

    @Autowired
    private GraphService graphService;

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieController.class);

    @RequestMapping(method = GET, path = "/getNumberOfActorsThatHaveActedInMoreThan1Movie")
    public int getNumberOfActorsThatHaveActedInMoreThan1Movie() {
        // Le code
        return 0;
    }
}
