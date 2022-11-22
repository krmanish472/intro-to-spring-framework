package com.example.demo;

import com.example.demo.game.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        // GamingConsole game = new SuperContraGame();
        // GamingConsole game = new MarioGame();
        GamingConsole game = new PackmanGame();
        // passing object of SuperContraGame
        GameRunner runner = new GameRunner(game);
        runner.run();
    }

}
