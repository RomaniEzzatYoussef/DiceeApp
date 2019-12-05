package com.romani.diceeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton = findViewById(R.id.rollButton);
        final ImageView leftDice = findViewById(R.id.image_leftDice);
        final ImageView rightDice = findViewById(R.id.image_rightDice);

        final int[] diceImages = {
                R.drawable.dice1 ,
                R.drawable.dice2 ,
                R.drawable.dice3 ,
                R.drawable.dice4 ,
                R.drawable.dice5 ,
                R.drawable.dice6};

        final Random randomNumberGenerator = new Random();
        rollButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View e)
            {
                int num = randomNumberGenerator.nextInt(6);
                leftDice.setImageResource(diceImages[num]);
                num = randomNumberGenerator.nextInt(6);
                rightDice.setImageResource(diceImages[num]);



            }
        });
    }
}
