package com.example.rpc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity implements Serializable {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Player player1 = new Player("player1") ;
        Player player2 = new Player("player2");

        //this one will show you what the player choose and will change it , below is the default value
        TextView text = findViewById(R.id.userChoose);
        text.setText("Choose your fighter");

        //THE COUNTER ... THIS IS NOT IMPORTANT FOR THE GAME
        Counter counter = new Counter() ;
        TextView counterInMainUI = findViewById(R.id.counter);
        counterInMainUI.setText(counter.getStringCounter());

        Button submit = findViewById(R.id.submit);
        submit.setGravity(Gravity.CENTER);


        //this is the pic of the chosen fighter
        ImageView choicePic =  (ImageView) findViewById(R.id.choicePic);

        //this click object is using  a class which solve all the animation and choice that happens
        OnClickChangePic clicky = new OnClickChangePic(choicePic,text,player1);

        Button rockButton = findViewById(R.id.rockButton);
        rockButton.setOnClickListener(new View.OnClickListener() {

            //When pressing Rock button this happens



            @Override
            public void onClick(View v) {
                clicky.ClickOneOfTheFighters("ROCK");
            }

        });


        Button paperButton = findViewById(R.id.paperButton);
        paperButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                clicky.ClickOneOfTheFighters("PAPER");

            }
        });

        Button scissorsButton = findViewById(R.id.scissorsButton);
        scissorsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicky.ClickOneOfTheFighters("SCISSORS");


            }
        });


        // ======================================================================
        // GET BACK HERE LATER TO CHANGE THE ANIMATION

        Button submitButton = findViewById(R.id.submit);


        TextView player1ScoreDisplay = findViewById(R.id.player1score);
        TextView player2ScoreDisplay = findViewById(R.id.player2score);


        player1ScoreDisplay.setText(String.valueOf(player1.getNumberOfWins()));
        player2ScoreDisplay.setText(String.valueOf(player2.getNumberOfWins()));


            submitButton.setOnClickListener(new View.OnClickListener() {

            @Override

            public void onClick(View v) {
                if (player1.getChoice().equals("")) {
                    Toast.makeText(getApplicationContext(), "You need to choose a Fighter", Toast.LENGTH_LONG).show();

                }
                else {
                    Intent intent = new Intent(MainActivity.this, BattleLayout.class);
                    intent.putExtra("player1", (Serializable) player1);
                    intent.putExtra("player2", (Serializable) player2);
                    startActivity(intent);


                    player1ScoreDisplay.setText(String.valueOf(player1.getNumberOfWins()));
                    player2ScoreDisplay.setText(String.valueOf(player2.getNumberOfWins()));


                }


            }
        });









//*********change the submit button to work in a seperate class
//        IT WOULD PLAY AND THERE IS A RESULT IN THE GAME



    }


}