package webapp.spring.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.spring.webapp.model.Book;

public interface BookReposiotory extends CrudRepository<Book, Long> {
}

