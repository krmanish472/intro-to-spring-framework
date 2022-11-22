package com.example.demo;

import com.example.demo.game.GameRunner;
import com.example.demo.game.MarioGame;
import com.example.demo.game.SuperContraGame;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

/*        MarioGame game = new MarioGame();
        // passing object of MarioGame
        GameRunner runner = new GameRunner(game);
        runner.run();*/

        SuperContraGame game = new SuperContraGame();
        // passing object of SuperContraGame
        GameRunner runner = new GameRunner(game);
        runner.run();
    }

}
