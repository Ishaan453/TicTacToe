package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Results extends AppCompatActivity {
    public static final String EXTRA_N= "com.example.tictactoe123.extra.NAME";
    public Button playagain;
    public String name;
    public String winner;
    public TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        textView = findViewById(R.id.textView2);
        playagain = findViewById(R.id.button11);
        Intent i = getIntent();
        name = i.getStringExtra(TicTacToe.EXTRA_NAM);
        winner = i.getStringExtra(TicTacToe.EXTRA_NAME);
        if(winner.equals("1"))
            textView.setText("Congratulations you Won \uD83E\uDD73 \uD83E\uDD73");
        else if(winner.equals("2"))
            textView.setText("Computer won \uD83D\uDE1E ");
        else if(winner.equals("3"))
            textView.setText("Tie \uD83D\uDE43");
        else
            textView.setText("Error");
    }
    public void playagn(View v){
        Intent i2 = new Intent(this,TicTacToe.class);
        i2.putExtra(EXTRA_N, name);
        startActivity(i2);
    }

    public void homeScreenBtn(View v){
        Intent i10 = new Intent(this,MainActivity.class);
        startActivity(i10);
    }
}