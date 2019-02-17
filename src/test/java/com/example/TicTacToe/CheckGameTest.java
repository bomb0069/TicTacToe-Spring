package com.example.TicTacToe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckGameTest {

    @Test
    public void new_game_and_check_was_continues() {
        Game game = new Game();
        assertEquals(game.CONTINUE_GAME, game.check());
    }
}
