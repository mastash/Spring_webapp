package webapp.spring.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.spring.webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}

