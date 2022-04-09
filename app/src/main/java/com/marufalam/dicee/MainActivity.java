package com.marufalam.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView leftDice, rightDice;
    Button rollDice;
    TextView countDice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rollDice = findViewById(R.id.rollButton);
        leftDice = findViewById(R.id.logo_left_dice);
        rightDice = findViewById(R.id.logo_right_dice);
        countDice = findViewById(R.id.count);

        rollDice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int[] diceArray = {
                        R.drawable.dice1,
                        R.drawable.dice2,
                        R.drawable.dice3,
                        R.drawable.dice4,
                        R.drawable.dice5,
                        R.drawable.dice6,
                };
                Random randomNumberGenerate = new Random();
                int randomNumber = randomNumberGenerate.nextInt(6);
                leftDice.setImageResource(diceArray[randomNumber]);
                int randomNumbert = randomNumberGenerate.nextInt(6);
                rightDice.setImageResource(diceArray[randomNumbert]);
                int add = (randomNumber+1)+(randomNumbert+1);
                countDice.setText(""+add);
                Log.d("left dice", "left dice random number is :" + randomNumbert);
            }
        });


    }
}