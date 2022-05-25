package com.example.childhoodmath;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MultiPlyAdapter extends RecyclerView.Adapter<MultiPlyAdapter.myViewHolder> {

    Context context;
    ArrayList<multiModel> arrayList;

    public MultiPlyAdapter(Context context, ArrayList<multiModel> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public myViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new myViewHolder(LayoutInflater.from(context).inflate(R.layout.multiply_items, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull myViewHolder holder, int position) {
        multiModel model = arrayList.get(position);
        holder.Square.setText(model.getSquare());
        holder.number.setText(model.getNumber());

        int itemPosition = holder.getAdapterPosition();

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                switch (itemPosition){

                    case 0:
                        Intent intent = new Intent(context, MultiplyWork.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent);
                        break;

                    case 1:
                        Intent intentt = new Intent(context, QueDigists.class);
                        intentt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intentt.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intentt);
                        break;
                    case 2:
                        Intent intent2 = new Intent(context, QueDigistsThree.class);
                        intent2.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intent2.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intent2);
                        break;
                    case 3:
                        Intent intentt3 = new Intent(context, QueDigistsFourth.class);
                        intentt3.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intentt3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intentt3);
                        break;

                    case 4:
                        Intent intentt5 = new Intent(context, QueDigistsFifth.class);
                        intentt5.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                        intentt5.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        context.startActivity(intentt5);
                        break;


                }

            }
        });

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class myViewHolder extends RecyclerView.ViewHolder {

        TextView number, Square;


        public myViewHolder(@NonNull View itemView) {
            super(itemView);
            number = itemView.findViewById(R.id.textView3);
            Square = itemView.findViewById(R.id.textSquare);
        }
    }
}
