package com.git.ranjit.joke.jokeapp.configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Ranjit on 2020-06-28
 */
@Configuration
public class ChuckConfiguration {
    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
