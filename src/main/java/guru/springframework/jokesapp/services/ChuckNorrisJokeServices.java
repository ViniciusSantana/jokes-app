package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

import java.lang.invoke.VarHandle;
@Service
public class ChuckNorrisJokeServices implements JokeServices {
    private final ChuckNorrisQuotes quotes = new ChuckNorrisQuotes ();

    @Override
    public String getJoke(){
        return quotes.getRandomQuote();
    }
}
