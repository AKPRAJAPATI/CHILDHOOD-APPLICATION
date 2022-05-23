package com.example.childhoodmath;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class ActivityDetailBinding extends AppCompatActivity {


    TextView myFormula;
    LinearLayout linearLayout;

    EditText firstNumber, secondNumber;
    AppCompatButton res_btn;
    TextView a1, a2, b1, b2, _2ab1;

    TextView m1, m2, m1ab;
    TextView r1, r1ab;
    TextView xab, y00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        findYourIds();
        String formla = getIntent().getStringExtra("formula");
        myFormula.setText(formla);

        res_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(firstNumber.getText().toString())) {
                    linearLayout.setVisibility(View.GONE);
                    Toast.makeText(ActivityDetailBinding.this, "A is empty", Toast.LENGTH_SHORT).show();
                } else if (TextUtils.isEmpty(secondNumber.getText().toString())) {
                    linearLayout.setVisibility(View.GONE);
                    Toast.makeText(ActivityDetailBinding.this, "B is empty", Toast.LENGTH_SHORT).show();
                } else {
                    linearLayout.setVisibility(View.VISIBLE);
                    addMyAllTheData(firstNumber.getText().toString(), secondNumber.getText().toString());
                }
            }
        });

    }

    private void addMyAllTheData(String firstNum, String secondNum) {
        //first line
        a1.setText(firstNum);
        a2.setText(firstNum);
        b1.setText(secondNum);
        b2.setText(secondNum);
        _2ab1.setText("2" + "*" + firstNum + "*" + secondNum);

        //second line
        int a, b, c;

        int mA = Integer.parseInt(firstNum);
        int mB = Integer.parseInt(secondNum);

        int mC = mA * mA;
        m1.setText(mC + "");

        int mD = mB * mB;
        m2.setText(mD + "");

        int mE = 2 * mA * mB;
        m1ab.setText(mE + "");

        //third line

        int mF = mC + mD;
        r1.setText(mF + "");
        r1ab.setText(mE + "");
//Fourth Line
        int mG = mF + mE;
        xab.setText(mG + "");
        //Answer
        y00.setText(mG + "");


    }

    private void findYourIds() {
        firstNumber = findViewById(R.id.firstNumber);
        secondNumber = findViewById(R.id.secondNumber);
        myFormula = findViewById(R.id.formula);
        linearLayout = findViewById(R.id.fullLinearlayoutWork);
        res_btn = findViewById(R.id.button);


        a1 = findViewById(R.id.a1);
        a2 = findViewById(R.id.a2);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        _2ab1 = findViewById(R.id.ab1);
        m1 = findViewById(R.id.m1);
        m2 = findViewById(R.id.m2);
        m1ab = findViewById(R.id.m1ab);

        r1 = findViewById(R.id.r1);
        r1ab = findViewById(R.id.t2ab);

        xab = findViewById(R.id.xab);
        y00 = findViewById(R.id.ansy);


    }
}