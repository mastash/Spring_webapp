package webapp.spring.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.spring.webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {


}
