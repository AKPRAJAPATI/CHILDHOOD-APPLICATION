package com.example.childhoodmath;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;

public class TableActivity extends AppCompatActivity {
    AppCompatButton findTableButton;
    EditText getTitleNumber;
    TextView showTable;
    TextView showTableSEcond;
    ConstraintLayout constraintLayout;
    int ans = 0;
    StringBuffer buffer,buffer2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        constraintLayout = findViewById(R.id.constraintLayout);

        findTableButton = findViewById(R.id.button);
        getTitleNumber = findViewById(R.id.getTableNumber);
        showTable = findViewById(R.id.showTableText);

        findTableButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (TextUtils.isEmpty(getTitleNumber.getText().toString())) {
                    constraintLayout.setVisibility(View.GONE);
                    Toast.makeText(TableActivity.this, "Enter any value for table", Toast.LENGTH_SHORT).show();
                } else {
                    constraintLayout.setVisibility(View.VISIBLE);
                      buffer = new StringBuffer();

                    String fs = getTitleNumber.getText().toString();
                    int n = Integer.parseInt(fs);


                    for (int i = 1; i <= 10; i++) {
                        ans = (i * n);
                        buffer.append(n + " X " + i + " = " + ans + "\n\n");

                    }

                    showTable.setText(buffer);

                }
            }
        });

    }
}