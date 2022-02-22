package com.example.student.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;
import com.example.student.StudentAteendenceActivity;


public class EnrolmentInformationAdapter extends RecyclerView.Adapter<EnrolmentInformationAdapter.MyViewHolder> {

    String[] stringList;
    private Context mContext;


    public EnrolmentInformationAdapter(Context context, String[] stringList) {
        mContext = context;
        this.stringList = stringList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_candidate, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {

        holder.name.setText(stringList[position]);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(mContext, StudentAteendenceActivity.class);
                mContext.startActivity(i);

            }
        });




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
            name = view.findViewById(R.id.name);
            id = view.findViewById(R.id.id);
            mobile = view.findViewById(R.id.mob);
            practice = view.findViewById(R.id.prac);
            course = view.findViewById(R.id.course);
            status = view.findViewById(R.id.status);
            regId = view.findViewById(R.id.regId);
            kyc = view.findViewById(R.id.kyc);
            cardView = view.findViewById(R.id.card_view);
        }
    }

}
