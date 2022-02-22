package com.example.student.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;


public class Attendancedapter extends RecyclerView.Adapter<Attendancedapter.MyViewHolder> {

    String[] stringList;
    private Context mContext;


    public Attendancedapter(Context context, String[] stringList) {
        mContext = context;
        this.stringList = stringList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.attendence_item_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.id.setText(stringList[position]);


    }

    @Override
    public int getItemCount() {
        return stringList.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        AppCompatTextView name, id, mobile, practice, course, status, regId, kyc;
        CardView cardView;

        MyViewHolder(View view) {
            super(view);

            id = view.findViewById(R.id.id);
            mobile = view.findViewById(R.id.mob);

        }

    }
}
