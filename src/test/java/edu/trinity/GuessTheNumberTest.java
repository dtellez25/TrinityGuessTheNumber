package edu.trinity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GuessTheNumberTest {

    @Test
    public void testCorrectGuess() {
        GuessTheNumber game = new GuessTheNumber();
        String result = game.guess(game.randomNumber);
        assertEquals("correct", result);
    }

    @Test
    public void testWrongGuess() {
        GuessTheNumber game = new GuessTheNumber();
        int wrongGuess = game.randomNumber + 1;
        String result = game.guess(wrongGuess);
        assertEquals("wrong", result);
    }
}
