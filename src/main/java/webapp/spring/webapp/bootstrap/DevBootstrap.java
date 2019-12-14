package webapp.spring.webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import webapp.spring.webapp.model.Author;
import webapp.spring.webapp.model.Book;
import webapp.spring.webapp.model.Publisher;
import webapp.spring.webapp.repositories.AuthorRepository;
import webapp.spring.webapp.repositories.BookRepository;
import webapp.spring.webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Publisher publisher = new Publisher();
        publisher.setName("foo");
        publisherRepository.save(publisher);

        Author mickiewicz = new Author("Adam", "Mickiewicz");
        Author gombrowicz = new Author("Witold", "Gombrowicz");
        Author orzeszkowa = new Author("Eliza", "Orzeszkowa");

//        authorRepository.save(mickiewicz);
//        authorRepository.save(gombrowicz);
//        authorRepository.save(iksinski);

        Book dziady = new Book("Dziady", publisher, 15133);
        Book nadNiemnem = new Book("Nad Niemnem", publisher, 6666);
        Book chlopi = new Book("Chłopi", publisher, 7777);

//        bookRepository.save(dziady);
//        bookRepository.save(nadNiemnem);
//        bookRepository.save(chlopi);


        mickiewicz.getBooks().add(dziady);
        dziady.getAuthors().add(mickiewicz);

        mickiewicz.getBooks().add(chlopi);
        chlopi.getAuthors().add(mickiewicz);

        orzeszkowa.getBooks().add(nadNiemnem);
        nadNiemnem.getAuthors().add(orzeszkowa);





        authorRepository.save(mickiewicz);
        authorRepository.save(gombrowicz);
        authorRepository.save(orzeszkowa);
        bookRepository.save(dziady);
        bookRepository.save(nadNiemnem);
        bookRepository.save(chlopi);



//        orzeszkowa.getBooks().add(nadNiemnem);
//        nadNiemnem.getAuthors().add(orzeszkowa);
//
//        gombrowicz.getBooks().add(nadNiemnem);
//        nadNiemnem.getAuthors().add(gombrowicz);
//
//        chlopi.getAuthors().add(gombrowicz);
//        gombrowicz.getBooks().add(chlopi);
//
//
//        authorRepository.save(mickiewicz);
//        authorRepository.save(gombrowicz);
//        authorRepository.save(iksinski);
//        bookRepository.save(dziady);
//        bookRepository.save(nadNiemnem);
//        bookRepository.save(chlopi);









//        Author radS = new Author("Rad", "Stevens");
//        Book cebulionBook = new Book("Książka o cebuli", "Księgarnia Pana Janka", 1598736);
//        radS.getBooks().add(cebulionBook);
//        cebulionBook.getAuthors().add(radS);
//        authorRepository.save(radS);
//        bookRepository.save(cebulionBook);
//
//
//        Author sebastianD = new Author("Sebastian", "De");
//        Book podrecznik = new Book("Podrecznik do programowania", "Wydawnictwo pwn", 66666666);
//        sebastianD.getBooks().add(podrecznik);
//        podrecznik.getAuthors().add(radS);
//        authorRepository.save(sebastianD);
//        bookRepository.save(podrecznik);
//
//        radS.getBooks().add(podrecznik);
//        sebastianD.getBooks().add(cebulionBook);
//        podrecznik.getAuthors().add(radS);
//        cebulionBook.getAuthors().add(sebastianD);
//        authorRepository.save(radS);
//
//        bookRepository.save(podrecznik);
//        authorRepository.save(sebastianD);
//        bookRepository.save(cebulionBook);







    }
}
