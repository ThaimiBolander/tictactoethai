package se.iths.thailambo.tictactoethai;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {
    Model model = new Model();

    @Test
    @DisplayName("Test for Horizontal Winner🌅")
    void testForHorizontalWinner () {
        model.setCell1("X");
        model.setCell2("X");
        model.setCell3("X");
        model.checkForGameOver();
        assertTrue(model.gameOver);
        assertEquals("X", model.currentPlayer);
    }

    @Test
    @DisplayName("Test for Vertical Winner↕️")
    void testForVerticalWinner () {
        model.setCell2("X");
        model.setCell5("X");
        model.setCell8("X");
        model.checkForGameOver();
        assertTrue(model.gameOver);
        assertEquals("X", model.currentPlayer);
    }

    @Test
    @DisplayName("Test for a Draw, Nobody Wins🤷‍♀️")
    void testForADrawNobodyWins () {
        model.setCell1("X");
        model.setCell2("O");
        model.setCell3("X");
        model.setCell4("X");
        model.setCell5("O");
        model.setCell6("X");
        model.setCell7("O");
        model.setCell8("X");
        model.setCell9("O");
        assertTrue(!model.gameOver, "Nobody wins, Game over");
        assertFalse(model.getPlayerScore() > 0, "Player: X should not win");
        assertFalse(model.getComputerScore() > 0, "Computer: O should not win");
    }
}
