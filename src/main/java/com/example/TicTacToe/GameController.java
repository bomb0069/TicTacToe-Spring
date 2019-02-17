package com.example.TicTacToe;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class GameController {

    @RequestMapping("/api/v1/xo/turn")
    public Game index() {
        return new Game();
    }

}