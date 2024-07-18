package org.game;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class RockPaperScissorsTest {

    @Test
    public void testGetComputerMove() {
        String computerMove = RockPaperScissors.getComputerMove();
        assertTrue(computerMove.equals("R") || computerMove.equals("P") || computerMove.equals("S"));
    }

    @Test
    public void testDetermineWinnerComputerWins()
    {
        assertEquals("lose", RockPaperScissors.determineWinner("R", "P"));
        assertEquals("lose", RockPaperScissors.determineWinner("P", "S"));
        assertEquals("lose", RockPaperScissors.determineWinner("S", "R"));
    }

    @Test
    public void testDetermineWinnerPlayerWins()
    {
        assertEquals("win", RockPaperScissors.determineWinner("P", "R"));
        assertEquals("win", RockPaperScissors.determineWinner("S", "P"));
        assertEquals("win", RockPaperScissors.determineWinner("R", "S"));
    }

    @Test
    public void testDetermineWinnerTie()
    {
        assertEquals("tie", RockPaperScissors.determineWinner("P", "P"));
        assertEquals("tie", RockPaperScissors.determineWinner("S", "S"));
        assertEquals("tie", RockPaperScissors.determineWinner("R", "R"));
    }
}