package bo.edu.ucb.ingsoft.languages;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "languages", path = "languages")
public interface LanguageRestRepository extends PagingAndSortingRepository<Language, Integer> {

    List<Language> findByName(@Param("name") String name);
}
