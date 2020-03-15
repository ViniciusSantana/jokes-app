package guru.springframework.jokesapp.controller;

import guru.springframework.jokesapp.services.JokeServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final JokeServices services;

    public JokesController(JokeServices services) {
        this.services = services;
    }

    @RequestMapping
    public String getJoke(Model model){

        model.addAttribute("joke", services.getJoke());
        return "chucknorris";
    }
}
