package com.example.erinna.hackweekfa2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class GameActivity extends AppCompatActivity {

    private EditText etGuess;
    private Button btnGuess;

    private int number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        etGuess = (EditText) findViewById(R.id.etGuess);
        btnGuess = (Button) findViewById(R.id.btnGuess);

        Random random = new Random();
        number = random.nextInt(10)+1;

        String getName = (String) getIntent().getSerializableExtra(MainActivity.NAME_KEY);

        Toast.makeText(this, getName, Toast.LENGTH_LONG).show();
        btnGuess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int guessNumber = Integer.valueOf(etGuess.getText().toString());

                if (guessNumber == number)
                    Toast.makeText(GameActivity.this, "CONGRATS YOU WON!", Toast.LENGTH_LONG).show();
                else if (guessNumber < number)
                    Toast.makeText(GameActivity.this, "too low, guess higher", Toast.LENGTH_SHORT).show();
                else if (guessNumber > number)
                    Toast.makeText(GameActivity.this, "too high, guess lower", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
