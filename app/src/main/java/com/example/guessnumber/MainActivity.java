package com.example.guessnumber;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showGuess(View view) {

        TextView textView = findViewById(R.id.displayText);
        Random random = new Random();
        int randNumb = random.nextInt(10);
        textView.setText(randNumb + "");


    }
}