package com.codegym;

public class NumberGenerator implements Runnable{
    private Thread thread;
    private String name;

    public NumberGenerator(String name) {
        this.name = name;
        thread = new Thread(this,"new thread");
        System.out.println("Created");
    }

    public Thread getThread() {
        return thread;
    }

    @Override
    public void run() {
        try{
            for(int i = 1; i <= 10; i++){
                System.out.println(i + name);
                Thread.sleep(500);
            }
        } catch (InterruptedException e){
            System.out.println("Interrupted");
        }
        System.out.println("Dead");
    }
}
