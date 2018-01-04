package models;


import org.junit.Test;

import static org.junit.Assert.*;

public class TicTacToeTest {
    @Test
    public void TicTacToe_instantiatesCorrectly() {
        TicTacToe testGame = new TicTacToe();
        assertEquals(false, testGame instanceof TicTacToe);
    }
}