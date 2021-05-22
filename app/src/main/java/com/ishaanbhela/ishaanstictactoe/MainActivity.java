package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public TextView textView;
    public EditText editText;
    public EditText P1;
    public EditText P2;
    public static final String EXTRA = "com.example.tictactoe123.extra.NAME";
    public static final String E_1 = "com.example.tictactoe789.extra.NAME";
    public static final String E_2 = "com.example.tictactoe79.extra.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        editText = findViewById(R.id.editTextTextPersonName);
        P1 = findViewById(R.id.editTextTextPersonName2);
        P2 = findViewById(R.id.editTextTextPersonName3);
    }
    public void openGameSinglePlay(View v){
        Toast.makeText(this, "Opening Game", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,TicTacToe.class);
        String name = editText.getText().toString();
        if(name.length()>10){
            Toast.makeText(this, "Name should be less then 10 characters", Toast.LENGTH_SHORT).show();
        }
        else {
            if(name.isEmpty()){
                name = "Player";
            }
            intent.putExtra(EXTRA, name);
            startActivity(intent);
        }
    }
    public void openGameMultiPla(View v){
        Intent i1 = new Intent(this,TicTacToe2Player.class);
        String P1Name = P1.getText().toString();
        if(P1Name.equals(""))
            P1Name = "Player1";
        String P2Name = P2.getText().toString();
        if(P2Name.equals(""))
            P2Name = "Player2";
        if(P1Name.length()>10 || P2Name.length()>10){
            Toast.makeText(this, "Name should be less then 10 characters", Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,"Opening Game", Toast.LENGTH_SHORT).show();
            i1.putExtra(E_1, P1Name);
            i1.putExtra(E_2, P2Name);
            startActivity(i1);
        }
    }
}