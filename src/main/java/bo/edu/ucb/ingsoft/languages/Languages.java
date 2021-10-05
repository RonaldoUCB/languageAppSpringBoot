package bo.edu.ucb.ingsoft.languages;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;

@RestController
public class Languages {

    List<Language> languageList = new ArrayList<>();

    @GetMapping(path = "/languageOld", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Language> listAll2() {
        return languageList;
    }

    @PostMapping(path = "/language", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Language listAll2(@RequestBody Language language) {
        languageList.add(language);
        return language;
    }
}
