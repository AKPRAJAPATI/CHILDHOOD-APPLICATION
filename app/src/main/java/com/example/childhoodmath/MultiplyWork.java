package com.example.childhoodmath;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.childhoodmath.R;

public class MultiplyWork extends AppCompatActivity {


    TextView result;
    int ans = 0;
    StringBuffer buffer,buffer2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply_work);



        result = findViewById(R.id.resultofsquare);

        String square = getIntent().getStringExtra("firstSquare");
        String que = getIntent().getStringExtra("secondSquare");

        buffer = new StringBuffer();
        for (int i = 1; i <= 1000; i++) {
            ans = (i * i);

            buffer.append(i + " X " + i + " = " + ans + "\n\n");

        }

        result.setText(buffer);

    }
}