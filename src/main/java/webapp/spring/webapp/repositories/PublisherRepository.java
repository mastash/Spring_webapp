package webapp.spring.webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import webapp.spring.webapp.model.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}


