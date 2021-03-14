package com.example.rpc;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.io.Serializable;
import java.util.Random;

public class BattleLayout extends AppCompatActivity   {
    //CHECK THE https://stackoverflow.com/questions/2736389/how-to-pass-an-object-from-one-activity-to-another-on-android

    public BattleLayout() {


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.battle_layout);

        Intent intent = getIntent();
        Player player1 = (Player)intent.getSerializableExtra("player1");
        Player player2 = (Player)intent.getSerializableExtra("player2");

        Random rand = new Random() ;
        int randomChoiceForPlayer2 = rand.nextInt(3);
        WinRPS challange = new WinRPS( player1 , player2 );


            ImageView playerChosenFighterImage = (ImageView)findViewById(R.id.playerChosenFighterImage);
            //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~BREAK HERE 908-2309569-83=0236-82-86-93
            switch(player1.getChoice()) {
                case "ROCK":
                    playerChosenFighterImage.setImageResource(R.drawable.rock);
                    break;
                case "PAPER":
                    playerChosenFighterImage.setImageResource(R.drawable.paper);
                    break;
                case "SCISSORS":
                    playerChosenFighterImage.setImageResource(R.drawable.scissors);
                    break;
            }


            ImageView cpuChoice = (ImageView) findViewById(R.id.cpuChoice);
            switch(randomChoiceForPlayer2) {
                case 0:
                    player2.setChoice("ROCK");
                    break;
                case 1:
                    player2.setChoice("PAPER");
                    break;
                case 2:
                    player2.setChoice("SCISSORS");
                    break;
            }

            switch (player2.getChoice()) {
                case "ROCK":
                    cpuChoice.setImageResource(R.drawable.rock);
                    System.out.println("CPU CHOOSE ROCK");
                    break;
                case "PAPER":
                    cpuChoice.setImageResource(R.drawable.paper);
                    System.out.println("CPU CHOOSE PAPER");
                    break;
                case "SCISSORS":
                    cpuChoice.setImageResource(R.drawable.scissors);
                    System.out.println("CPU CHOOSE SCISSORS");
                    break;
            }
            // HERE IS THE WINNER NAME , YOU CAN ADD ANIMATION LATER ON


            TextView winnerNameText = findViewById(R.id.winnerNameText);


                String winnerName =challange.winnerPlayer();
                if (winnerName.equals("TIE")) {
                    winnerNameText.setText(winnerName);
                } else {
                    winnerNameText.setText(winnerName + " has WON !!!");
                }




        //Reset button to go back to the previous Layout

            Button resetButton = findViewById(R.id.reset);
            resetButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    finish();

                }
            });

    }

}
