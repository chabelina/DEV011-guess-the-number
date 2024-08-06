package test;
import mygame.HumanPlayer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Scanner;
import java.io.ByteArrayInputStream;

public class HumanPlayerTest {
    @Test
    void testMakeGuess()
    {
        String input = "32";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        HumanPlayer humanPlayer = new HumanPlayer();
        int result = humanPlayer.makeGuess();

        Assertions.assertEquals(32, result, "makeGuess should return user's guess (32)");

    }

}

