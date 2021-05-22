package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe2Player extends AppCompatActivity {
    public static final String EXTRA_1 = "com.example.tictactoe312.extra.NAME";
    public static final String EXTRA_2 = "com.example.tictactoe322.extra.NAME";
    public static final String EXTRA_3 = "com.example.tictactoe332.extra.NAME";
    public TextView playerName;
    public TextView PlayerTurn;
    public Button btn_1;
    public Button btn_2;
    public Button btn_3;
    public Button btn_4;
    public Button btn_5;
    public Button btn_6;
    public Button btn_7;
    public Button btn_8;
    public Button btn_9;
    public String winner = "";
    public String name1;
    public String name2;
    public String swap="";
    public int randS;
    int Chance = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe2_player);
        btn_1 = findViewById(R.id.button);
        btn_2 = findViewById(R.id.button2);
        btn_3 = findViewById(R.id.button3);
        btn_4 = findViewById(R.id.button4);
        btn_5 = findViewById(R.id.button5);
        btn_6 = findViewById(R.id.button6);
        btn_7 = findViewById(R.id.button7);
        btn_8 = findViewById(R.id.button8);
        btn_9 = findViewById(R.id.button9);
        playerName = findViewById(R.id.textView3);
        PlayerTurn = findViewById(R.id.textView7);
        Intent i1 = getIntent();
        Intent i6 = getIntent();
        name1 = i6.getStringExtra(ResultsMultiPlayer.EXTRA_11);
        name2 = i6.getStringExtra(ResultsMultiPlayer.EXTRA_12);
        if(name1==null && name2==null) {
            name1 = i1.getStringExtra(MainActivity.E_1);
            name2 = i1.getStringExtra(MainActivity.E_2);
        }
        randS = (int)((Math.random()*10)+1);
        if(randS == 3 || randS == 4 || randS == 5 || randS == 6 || randS == 7 || randS == 8 ||randS == 9 || randS == 10)
        {
            swap = name1;
            name1 = name2;
            name2 = swap;
        }
        playerName.setText(name1+" : X\nvs\n"+name2+ " : O");
    }

    public void press_Btn1(View v){
        if(btn_1.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_1.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_1.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn2(View v){
        if(btn_2.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_2.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_2.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn3(View v){
        if(btn_3.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_3.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_3.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn4(View v){
        if(btn_4.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_4.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_4.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            String swap = String.valueOf(randS);
            startActivity(i5);
        }

    }

    public void press_Btn5(View v){
        if(btn_5.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_5.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_5.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn6(View v){
        if(btn_6.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_6.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_6.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn7(View v){
        if(btn_7.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_7.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_7.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn8(View v){
        if(btn_8.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_8.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_8.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void press_Btn9(View v){
        if(btn_9.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken!", Toast.LENGTH_SHORT).show();
        else{
            if(Chance%2==0) {
                PlayerTurn.setText("O turn");
                btn_9.setText("X");
                Chance++;
                Winner();
            }
            else {
                PlayerTurn.setText("X turn");
                btn_9.setText("O");
                Chance++;
                Winner();
            }
        }
        if (winner == "1" || winner == "2" || winner == "3"){
            Intent i5 = new Intent(this,ResultsMultiPlayer.class);
            i5.putExtra(EXTRA_1,name1);
            i5.putExtra(EXTRA_2,name2);
            i5.putExtra(EXTRA_3,winner);
            startActivity(i5);
        }

    }

    public void Winner() {

        if (btn_1.getText().toString() == "X" && btn_2.getText().toString() == "X" && btn_3.getText().toString() == "X")
            winner = "1";
        else if (btn_4.getText().toString() == "X" && btn_5.getText().toString() == "X" && btn_6.getText().toString() == "X")
            winner = "1";
        else if (btn_7.getText().toString() == "X" && btn_8.getText().toString() == "X" && btn_9.getText().toString() == "X")
            winner = "1";
        else if (btn_1.getText().toString() == "X" && btn_4.getText().toString() == "X" && btn_7.getText().toString() == "X")
            winner = "1";
        else if (btn_2.getText().toString() == "X" && btn_5.getText().toString() == "X" && btn_8.getText().toString() == "X")
            winner = "1";
        else if (btn_3.getText().toString() == "X" && btn_6.getText().toString() == "X" && btn_9.getText().toString() == "X")
            winner = "1";
        else if (btn_1.getText().toString() == "X" && btn_5.getText().toString() == "X" && btn_9.getText().toString() == "X")
            winner = "1";
        else if (btn_7.getText().toString() == "X" && btn_5.getText().toString() == "X" && btn_3.getText().toString() == "X")
            winner = "1";

        else if (btn_1.getText().toString() == "O" && btn_2.getText().toString() == "O" && btn_3.getText().toString() == "O")
            winner = "2";
        else if (btn_4.getText().toString() == "O" && btn_5.getText().toString() == "O" && btn_6.getText().toString() == "O")
            winner = "2";
        else if (btn_7.getText().toString() == "O" && btn_8.getText().toString() == "O" && btn_9.getText().toString() == "O")
            winner = "2";
        else if (btn_1.getText().toString() == "O" && btn_4.getText().toString() == "O" && btn_7.getText().toString() == "O")
            winner = "2";
        else if (btn_2.getText().toString() == "O" && btn_5.getText().toString() == "O" && btn_8.getText().toString() == "O")
            winner = "2";
        else if (btn_3.getText().toString() == "O" && btn_6.getText().toString() == "O" && btn_9.getText().toString() == "O")
            winner = "2";
        else if (btn_1.getText().toString() == "O" && btn_5.getText().toString() == "O" && btn_9.getText().toString() == "O")
            winner = "2";
        else if (btn_7.getText().toString() == "O" && btn_5.getText().toString() == "O" && btn_3.getText().toString() == "O")
            winner = "2";
        else if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner="3";
        else
            winner = "0";

    }
}