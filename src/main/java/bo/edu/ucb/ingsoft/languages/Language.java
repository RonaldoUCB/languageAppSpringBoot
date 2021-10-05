package bo.edu.ucb.ingsoft.languages;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "language")
public class Language {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer language_id;
    private String name;
    private String last_update;

    public Language() {
    }

    public Integer getLanguage_id() {
        return language_id;
    }

    public String getName() {
        return name;
    }

    public String getLast_update() {
        return last_update;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
