package com.example.rpc;

import java.io.Serializable;

public class Player implements Serializable {
    private String name;
    private String choice;
    private int numberOfWins;

    public Player (String name) {
        this.name = name;
        this.numberOfWins = 0;
        this.choice = "";
    }

    public String getName() {
        return name;
    }

    public int getNumberOfWins() {
        return numberOfWins;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choose) {
        this.choice = choose;
    }

    public void increaseWin() { this.numberOfWins++ ; }
    @Override
    public String toString() {
        return this.name;
    }
}
