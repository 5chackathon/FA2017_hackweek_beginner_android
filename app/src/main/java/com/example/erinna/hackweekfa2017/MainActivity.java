package com.example.erinna.hackweekfa2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_KEY = "NAME_KEY";

    private Button btnPlayGame;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPlayGame = (Button) findViewById(R.id.btnPlayGame);
        etName = (EditText) findViewById(R.id.etName);

        btnPlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "play game!",Toast.LENGTH_SHORT).show();
                Intent i = new Intent();
                i.setClass(MainActivity.this,GameActivity.class);
                String name = etName.getText().toString();
                i.putExtra(NAME_KEY, name);
                startActivity(i);
            }
        });
    }
}
