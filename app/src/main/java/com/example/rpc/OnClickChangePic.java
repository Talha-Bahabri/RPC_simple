package com.example.rpc;

import android.view.Gravity;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class OnClickChangePic {
    private ImageView choicePic;
    private TextView text;
    private Player player1;

    public OnClickChangePic(ImageView choicePic , TextView text ,Player player1) {
        this.choicePic = choicePic;
        this.text = text ;
        this.player1 = player1;
    }

    public void ClickOneOfTheFighters(String fighter) {
        if ( fighter.equals("ROCK")) {
                this.choicePic.setImageResource(R.drawable.rock);
        }
        else if (fighter.equals("PAPER")) {
            this.choicePic.setImageResource(R.drawable.paper);
        }
        else if (fighter.equals("SCISSORS")){
            this.choicePic.setImageResource(R.drawable.scissors);
        }

        AlphaAnimation animationAppear = new AlphaAnimation(0.0f, 1.0f);
        animationAppear.setDuration(250);
        this.choicePic.startAnimation(animationAppear);
        this.text.setText(fighter);
        this.text.setTextSize(50);
        this.choicePic.setVisibility(View.VISIBLE);
        this.text.setGravity(Gravity.CENTER | Gravity.BOTTOM);

        this.player1.setChoice(fighter);
//
//        counter.increaseCounter();
//        counterInMainUI.setText(counter.getStringCounter());
    }
}
