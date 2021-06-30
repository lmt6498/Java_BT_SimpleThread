package com.codegym;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGen1 = new NumberGenerator("A");
        NumberGenerator numberGen2 = new NumberGenerator("B");
        numberGen1.getThread().setPriority(Thread.MAX_PRIORITY);
        numberGen2.getThread().setPriority(Thread.MIN_PRIORITY);
        numberGen1.getThread().start();
        numberGen2.getThread().start();
    }
}
