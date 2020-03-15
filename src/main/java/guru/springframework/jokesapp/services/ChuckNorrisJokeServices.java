package guru.springframework.jokesapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;
@Service
public class ChuckNorrisJokeServices implements JokeServices {
    private final ChuckNorrisQuotes quotes;

    public ChuckNorrisJokeServices(ChuckNorrisQuotes quotes) {
        this.quotes = quotes;
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
