package com.git.ranjit.joke.jokeapp.controller;

import com.git.ranjit.joke.jokeapp.service.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ranjit on 2020-06-27
 */
@Controller
public class JokesController {

    private JokeService jokeService;

    @Autowired
    public JokesController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String shoJoke(Model model){

        model.addAttribute("joke",jokeService.getJoke());
        return "chucknorris";
    }

}
