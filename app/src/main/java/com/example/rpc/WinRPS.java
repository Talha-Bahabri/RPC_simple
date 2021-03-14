package com.example.rpc;

public class WinRPS {
    private Player player1;
    private Player player2;

    public WinRPS(Player player1 , Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public String winnerPlayer() {


        if (player1.getChoice().equals("ROCK")&& player2.getChoice().equals("ROCK")) {

            return "TIE";
        }
        if (player1.getChoice().equals("ROCK")&& player2.getChoice().equals("PAPER")) {
            System.out.println(this.player2.getName()+" wins");
            this.player2.increaseWin();
            return this.player2.getName();
        }
        if (player1.getChoice().equals("ROCK")&& player2.getChoice().equals("SCISSORS")) {
            System.out.println(this.player1.getName()+" wins");
            this.player1.increaseWin();
            return this.player1.getName();
        }






        if (player1.getChoice().equals("PAPER")&& player2.getChoice().equals("ROCK")) {
            System.out.println(this.player1.getName()+" wins");
            this.player1.increaseWin();
            return this.player1.getName();
        }
        if (player1.getChoice().equals("PAPER")&& player2.getChoice().equals("SCISSORS")) {
            System.out.println(this.player2.getName()+" wins");
            this.player2.increaseWin();
            return this.player2.getName();
        }
        if (player1.getChoice().equals("PAPER")&& player2.getChoice().equals("PAPER")) {

            return "TIE";
        }






        if (player1.getChoice().equals("SCISSORS")&& player2.getChoice().equals("ROCK")) {
            System.out.println(this.player2.getName()+" wins");
            this.player2.increaseWin();
            return this.player2.getName();
        }

        if (player1.getChoice().equals("SCISSORS")&& player2.getChoice().equals("PAPER")) {
            System.out.println(this.player1.getName()+" wins");
            this.player1.increaseWin();
            return this.player1.getName();
        }

        if (player1.getChoice().equals("SCISSORS")&& player2.getChoice().equals("SCISSORS")) {
            return "TIE";
        }

        return "TIE henda" ;
    }
}
