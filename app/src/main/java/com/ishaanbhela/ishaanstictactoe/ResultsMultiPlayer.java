package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultsMultiPlayer extends AppCompatActivity {
    public static final String EXTRA_11 = "com.example.tictactoe1199.extra.NAME";
    public static final String EXTRA_12 = "com.example.tictactoe1299.extra.NAME";
    public String name21;
    public String name22;
    public String winner;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results_multi_player);
        textView = findViewById(R.id.textView2);
        Intent i5 = getIntent();
        name21 = i5.getStringExtra(TicTacToe2Player.EXTRA_1);
        name22 = i5.getStringExtra(TicTacToe2Player.EXTRA_2);
        winner = i5.getStringExtra(TicTacToe2Player.EXTRA_3);

        if(winner.equals("1")) {
            textView.setText(name21 + " Won!");
        }
        else if(winner.equals("2")) {
            textView.setText(name22 + " Won!");
        }
        else if(winner.equals("3")) {
            textView.setText("Tie \uD83D\uDE43");
        }
        else
            textView.setText("Error");

    }
    public void playAgn(View v){
        Intent i6 = new Intent(this,TicTacToe2Player.class);
        i6.putExtra(EXTRA_11,name21);
        i6.putExtra(EXTRA_12,name22);
        startActivity(i6);
    }

    public void homeScreenBtn(View v){
        Intent i10 = new Intent(this,MainActivity.class);
        startActivity(i10);
    }
}