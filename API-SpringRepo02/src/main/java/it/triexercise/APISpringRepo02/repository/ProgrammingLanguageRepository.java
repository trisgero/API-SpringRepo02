package it.triexercise.APISpringRepo02.repository;

import it.triexercise.APISpringRepo02.entity.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Repository per la table 'ProgrammingLanguage'"))
public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Integer> {
}
