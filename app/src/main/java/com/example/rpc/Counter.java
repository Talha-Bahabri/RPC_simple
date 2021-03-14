package com.example.rpc;

public class Counter {
    private int counter;

    public Counter () {
        this.counter = 0 ;
    }

    public void increaseCounter() {
        this.counter++;
    }

    public String getStringCounter() {
        String counterString = String.valueOf(this.counter);
        return counterString;
    }
}
