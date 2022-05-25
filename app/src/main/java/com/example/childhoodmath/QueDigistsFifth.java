package com.example.childhoodmath;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class QueDigistsFifth extends AppCompatActivity {

    TextView result;
    int ans = 0;
    StringBuffer buffer,buffer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_que_digists_fifth);
        result = findViewById(R.id.resultofsquare);
        String square = getIntent().getStringExtra("firstSquare");
        String que = getIntent().getStringExtra("secondSquare");

        buffer = new StringBuffer();
        for (int i = 1; i <= 1000; i++) {
            ans = (i * i * i * i * i * i );

            buffer.append(i + " X " + i + " X " +i +" X " + i + " X " + i + " X "+ i + " = " + ans + "\n\n");

        }

        result.setText(buffer);
    }
}