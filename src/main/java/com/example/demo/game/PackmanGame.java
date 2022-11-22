package com.example.demo.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole {
    public void up() {
        System.out.println("PACKMAN GAME UP!!");
    }

    public void down() {
        System.out.println("PACKMAN GAME DOWN!!");
    }

    public void left() {
        System.out.println("PACKMAN GAME LEFT!!");
    }

    public void right() {
        System.out.println("PACKMAN GAME RIGHT!!");
    }

}
