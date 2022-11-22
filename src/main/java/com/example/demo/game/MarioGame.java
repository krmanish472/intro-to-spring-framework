package com.example.demo.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarioGame implements GamingConsole {

    public void up() {
        System.out.println("MARIO GAME UP!!");
    }

    public void down() {
        System.out.println("MARIO GAME DOWN!!");
    }

    public void left() {
        System.out.println("MARIO GAME LEFT!!");
    }

    public void right() {
        System.out.println("MARIO GAME RIGHT!!");
    }
}
