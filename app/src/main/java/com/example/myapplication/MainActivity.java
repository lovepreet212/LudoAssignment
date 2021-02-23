package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
     Button higher;
     Button lower;
     Random ran=new Random();
     ImageView computerDice;
     ImageView userDice;
     TextView text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        higher=findViewById(R.id.higher);
        lower=findViewById(R.id.lower);
        computerDice=findViewById(R.id.computer_dice);
        userDice=findViewById(R.id.user_dice);
        text=(TextView) findViewById(R.id.result);
        higher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = ran.nextInt(6) + 1;
                int number2 = ran.nextInt(6) + 1;
                int res1=getResources().getIdentifier("dice"+number1,"drawable","com.example.myapplication");
                int res2=getResources().getIdentifier("dice"+number2,"drawable","com.example.myapplication");
                computerDice.setImageResource(res1);
                userDice.setImageResource(res2);
                rollForHigher(number1,number2);
            }


        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = ran.nextInt(6) + 1;
                int number2 = ran.nextInt(6) + 1;
                int res1=getResources().getIdentifier("dice"+number1,"drawable","com.example.myapplication");
                int res2=getResources().getIdentifier("dice"+number2,"drawable","com.example.myapplication");
                computerDice.setImageResource(res1);
                userDice.setImageResource(res2);
                rollForLower(number1,number2);
            }
        });
    }
    private void rollForHigher(int number1, int number2) {

                if(number2>number1){
                 text.setText("User Wins");
                }
                else if(number1>number2){
                    text.setText("Computer Wins");
                }
                else{
                    text.setText("Tie");
                }


        }

    private void rollForLower(int number1, int number2) {

        if(number2<number1){
            text.setText("User Wins");
        }
        else if(number1<number2){
            text.setText("Computer Wins");
        }
        else{
            text.setText("Tie");
        }


    }
    }
