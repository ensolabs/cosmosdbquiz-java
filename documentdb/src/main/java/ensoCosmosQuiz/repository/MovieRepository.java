package ensoCosmosQuiz.repository;

import com.microsoft.azure.spring.data.documentdb.repository.DocumentDbRepository;
import ensoCosmosQuiz.models.Movie;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends DocumentDbRepository<Movie, String> {
}
