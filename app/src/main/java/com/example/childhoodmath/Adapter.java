package com.example.childhoodmath;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.viewHolder> {

    Context context;
    ArrayList<MainActivity.Models> arrayList;

    public Adapter(Context context, ArrayList<MainActivity.Models> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(context).inflate(R.layout.items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder holder, int position) {
       MainActivity.Models models = arrayList.get(position);

        holder.textView.setText(models.getFormuls());

        int myPosition = holder.getAdapterPosition();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                switch (myPosition) {
                    case 0:
                        Intent intent = new Intent(v.getContext(), ActivityDetailBinding.class);
                        intent.putExtra("formula", "(a+b)2 = a2+b2+2ab");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;
                    case 1:
                        Intent inten = new Intent(v.getContext(),  minusActivity.class);
                        inten.putExtra("formula", "(a-b)2 = a2+b2-2ab");
                        inten.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(inten);
                        break;
                    case 2:
                        Intent intent3 = new Intent(v.getContext(),  TableActivity.class);
                        intent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent3);
                        break;
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public viewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.formulas);
        }
    }
}
