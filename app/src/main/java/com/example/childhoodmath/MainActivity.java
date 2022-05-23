package com.example.childhoodmath;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        recyclerView = findViewById(R.id.recyclerview);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        ArrayList<Models> arrayList = new ArrayList<>();

        arrayList.add(new Models("(a+b)2 = a2+b2+2ab"));
        arrayList.add(new Models("(a-b)2 = a2+b2-2ab"));
        arrayList.add(new Models("Find Table"));


        recyclerView.setAdapter(new Adapter(getApplicationContext(),arrayList));
    }

    public static final class Models {
        String formuls;

        public Models(String formuls) {
            this.formuls = formuls;
        }

        public String getFormuls() {
            return formuls;
        }

        public void setFormuls(String formuls) {
            this.formuls = formuls;
        }
    }

}