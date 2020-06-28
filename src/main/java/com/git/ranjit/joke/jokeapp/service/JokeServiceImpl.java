package com.git.ranjit.joke.jokeapp.service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Ranjit on 2020-06-27
 */
@Service
public class JokeServiceImpl implements JokeService{

private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
            return chuckNorrisQuotes.getRandomQuote();
    }
}
