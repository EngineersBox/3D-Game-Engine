package com.base.engine;

import org.lwjgl.input.Keyboard;

public class Game {

    public Game() {

    }

    public void input() {
        if (Input.getKeyDown(Keyboard.KEY_UP)) {
            System.out.println("We've just pressed up!");
        }
        if (Input.getKeyUp(Keyboard.KEY_UP)) {
            System.out.println("We've just released up!");
        }

        if (Input.getMouseDown(1)) {
            System.out.println("We've just pressed RMB at " + Input.getMousePosition());
        }
        if (Input.getMouseUp(1)) {
            System.out.println("We've just released RMB!");
        }
    }

    public void update() {

    }

    public void render() {

    }

}
