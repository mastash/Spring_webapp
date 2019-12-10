package webapp.spring.webapp.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import webapp.spring.webapp.repositories.AuthorRepository;

@Controller
public class AuthorController {

    private AuthorRepository authorRepository;

    @Autowired
    public AuthorController(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @RequestMapping("/authors")
    public String getAuthors(Model model) {

        model.addAttribute("authors", authorRepository.findAll());
        return "authors";
    }
}
