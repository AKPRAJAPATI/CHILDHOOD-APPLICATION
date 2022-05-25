package com.example.childhoodmath;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Multiply extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiply);

        recyclerView = findViewById(R.id.multiplyItemRecyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(getApplicationContext(), 3));
        ArrayList<multiModel> arrayList = new ArrayList<>();
        arrayList.add(new multiModel("2", "2"));
        arrayList.add(new multiModel("3", "3"));
        arrayList.add(new multiModel("4", "4"));
        arrayList.add(new multiModel("5", "5"));
        arrayList.add(new multiModel("6", "6"));
        recyclerView.setAdapter(new MultiPlyAdapter(getApplicationContext(), arrayList));


    }
}