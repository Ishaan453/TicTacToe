package com.ishaanbhela.ishaanstictactoe;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TicTacToe extends AppCompatActivity {
    public static final String EXTRA_NAME = "com.example.tictactoe123.extra.NAME";
    public static final String EXTRA_NAM = "com.example.tictactor456.extra.Name";
    TextView playerName;
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
    public String name = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);
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
        Intent intent = getIntent();
        Intent i2 = getIntent();
        name = i2.getStringExtra(Results.EXTRA_N);
        name = intent.getStringExtra(MainActivity.EXTRA);
        if(name == "")
            name = "Player";
        playerName.setText(name + "\nVS\nComputer");
    }

    public void pressBtn_1(View v) {
        if (btn_1.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_1.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_2(View v) {
        if (btn_2.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_2.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_3(View v) {

        if (btn_3.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_3.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_4(View v) {
        if (btn_4.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_4.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_5(View v) {
        if (btn_5.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_5.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_6(View v) {
        if (btn_6.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_6.setText("X");
        if (!btn_1.getText().toString().equals("") && !btn_2.getText().toString().equals("") && !btn_3.getText().toString().equals("") && !btn_4.getText().toString().equals("") && !btn_5.getText().toString().equals("") && !btn_6.getText().toString().equals("") && !btn_7.getText().toString().equals("") && !btn_8.getText().toString().equals("") && !btn_9.getText().toString().equals(""))
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner.equals("1") || winner.equals("2") || winner.equals("3")) {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_7(View v) {
        if (btn_7.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_7.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_8(View v) {
        if (btn_8.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_8.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            winner = "3";
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
        }
    }

    public void pressBtn_9(View v) {
        if (btn_9.getText().toString() != "")
            Toast.makeText(this, "Space Already Taken", Toast.LENGTH_SHORT).show();
        else{
            btn_9.setText("X");
        if (btn_1.getText().toString() != "" && btn_2.getText().toString() != "" && btn_3.getText().toString() != "" && btn_4.getText().toString() != "" && btn_5.getText().toString() != "" && btn_6.getText().toString() != "" && btn_7.getText().toString() != "" && btn_8.getText().toString() != "" && btn_9.getText().toString() != "")
            Winner();
        else
            Compter_choose();
        Winner();
        if (winner == "1" || winner == "2" || winner == "3") {
            Intent i = new Intent(this, Results.class);
            i.putExtra(EXTRA_NAME, winner);
            i.putExtra(EXTRA_NAM, name);
            startActivity(i);
        }
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

    public void Compter_choose() {
        if (btn_1.getText().toString() == "O" && btn_2.getText().toString() == "O") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_2.getText().toString() == "O" && btn_3.getText().toString() == "O") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_1.getText().toString() == "O" && btn_3.getText().toString() == "O") {
            if (btn_2.getText().toString() != "")
                rand();
            else
                btn_2.setText("O");
        } else if (btn_4.getText().toString() == "O" && btn_5.getText().toString() == "O") {
            if (btn_6.getText().toString() != "")
                rand();
            else
                btn_6.setText("O");
        } else if (btn_5.getText().toString() == "O" && btn_6.getText().toString() == "O") {
            if (btn_4.getText().toString() != "")
                rand();
            else
                btn_4.setText("O");
        } else if (btn_4.getText().toString() == "O" && btn_6.getText().toString() == "O") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "O" && btn_8.getText().toString() == "O") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_8.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_7.setText("O");
        } else if (btn_7.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_8.getText().toString() != "")
                rand();
            else
                btn_8.setText("O");
        } else if (btn_1.getText().toString() == "O" && btn_4.getText().toString() == "O") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "O" && btn_4.getText().toString() == "O") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_1.setText("O");
        } else if (btn_1.getText().toString() == "O" && btn_7.getText().toString() == "O") {
            if (btn_4.getText().toString() != "")
                rand();
            else
                btn_4.setText("O");
        } else if (btn_2.getText().toString() == "O" && btn_5.getText().toString() == "O") {
            if (btn_8.getText().toString() != "")
                rand();
            else
                btn_8.setText("O");
        } else if (btn_5.getText().toString() == "O" && btn_8.getText().toString() == "O") {
            if (btn_2.getText().toString() != "")
                rand();
            else
                btn_2.setText("O");
        } else if (btn_2.getText().toString() == "O" && btn_8.getText().toString() == "O") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_3.getText().toString() == "O" && btn_6.getText().toString() == "O") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_6.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_3.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_6.getText().toString() != "")
                rand();
            else
                btn_6.setText("O");
        } else if (btn_1.getText().toString() == "O" && btn_5.getText().toString() == "O") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_5.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_1.setText("O");
        } else if (btn_1.getText().toString() == "O" && btn_9.getText().toString() == "O") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "O" && btn_5.getText().toString() == "O") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_5.getText().toString() == "O" && btn_3.getText().toString() == "O") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_7.setText("O");
        } else if (btn_7.getText().toString() == "O" && btn_3.getText().toString() == "O") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_2.getText().toString() == "X") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_2.getText().toString() == "X" && btn_3.getText().toString() == "X") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_3.getText().toString() == "X") {
            if (btn_2.getText().toString() != "")
                rand();
            else
                btn_2.setText("O");
        } else if (btn_4.getText().toString() == "X" && btn_5.getText().toString() == "X") {
            if (btn_6.getText().toString() != "")
                rand();
            else
                btn_6.setText("O");
        } else if (btn_5.getText().toString() == "X" && btn_6.getText().toString() == "X") {
            if (btn_4.getText().toString() != "")
                rand();
            else
                btn_4.setText("O");
        } else if (btn_4.getText().toString() == "X" && btn_6.getText().toString() == "X") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "X" && btn_8.getText().toString() == "X") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_8.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_7.setText("O");
        } else if (btn_7.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_8.getText().toString() != "")
                rand();
            else
                btn_8.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_4.getText().toString() == "X") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "X" && btn_4.getText().toString() == "X") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_1.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_7.getText().toString() == "X") {
            if (btn_4.getText().toString() != "")
                rand();
            else
                btn_4.setText("O");
        } else if (btn_2.getText().toString() == "X" && btn_5.getText().toString() == "X") {
            if (btn_8.getText().toString() != "")
                rand();
            else
                btn_8.setText("O");
        } else if (btn_5.getText().toString() == "X" && btn_8.getText().toString() == "X") {
            if (btn_2.getText().toString() != "")
                rand();
            else
                btn_2.setText("O");
        } else if (btn_2.getText().toString() == "X" && btn_8.getText().toString() == "X") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_3.getText().toString() == "X" && btn_6.getText().toString() == "X") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_6.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_3.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_6.getText().toString() != "")
                rand();
            else
                btn_6.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_5.getText().toString() == "X") {
            if (btn_9.getText().toString() != "")
                rand();
            else
                btn_9.setText("O");
        } else if (btn_5.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_1.getText().toString() != "")
                rand();
            else
                btn_1.setText("O");
        } else if (btn_1.getText().toString() == "X" && btn_9.getText().toString() == "X") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else if (btn_7.getText().toString() == "X" && btn_5.getText().toString() == "X") {
            if (btn_3.getText().toString() != "")
                rand();
            else
                btn_3.setText("O");
        } else if (btn_5.getText().toString() == "X" && btn_3.getText().toString() == "X") {
            if (btn_7.getText().toString() != "")
                rand();
            else
                btn_7.setText("O");
        } else if (btn_7.getText().toString() == "X" && btn_3.getText().toString() == "X") {
            if (btn_5.getText().toString() != "")
                rand();
            else
                btn_5.setText("O");
        } else {
            rand();
        }
    }

    public void rand() {
        int rand;
        while (true) {
            rand = (int) ((Math.random() * 8) + 1);
            if (rand == 1) {
                if (btn_1.getText().toString().equals("")) {
                    btn_1.setText("O");
                    break;
                }
            } else if (rand == 2) {
                if (btn_2.getText().toString().equals("")) {
                    btn_2.setText("O");
                    break;
                }
            } else if (rand == 3) {
                if (btn_3.getText().toString().equals("")) {
                    btn_3.setText("O");
                    break;
                }
            } else if (rand == 4) {
                if (btn_4.getText().toString().equals("")) {
                    btn_4.setText("O");
                    break;
                }
            } else if (rand == 5) {
                if (btn_5.getText().toString().equals("")) {
                    btn_5.setText("O");
                    break;
                }
            } else if (rand == 6) {
                if (btn_6.getText().toString().equals("")) {
                    btn_6.setText("O");
                    break;
                }
            } else if (rand == 7) {
                if (btn_7.getText().toString().equals("")) {
                    btn_7.setText("O");
                    break;
                }
            } else if (rand == 8) {
                if (btn_8.getText().toString().equals("")) {
                    btn_8.setText("O");
                    break;
                }
            } else if (rand == 9) {
                if (btn_9.getText().toString().equals("")) {
                    btn_9.setText("O");
                    break;
                }
            }

        }
    }
}