package com.example.student;

import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.adapter.EnrolmentInformationAdapter;

public class Enrolmentragment extends Fragment
{
    String[] stringList={"helo","hi"};
    EnrolmentInformationAdapter enrolmentInformationAdapter;
    RecyclerView enrolList;
    public Enrolmentragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.student_information, container, false);
        enrolList=view.findViewById(R.id.recycler_view);

        enrolmentInformationAdapter=new EnrolmentInformationAdapter(getContext(),stringList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        enrolList.setLayoutManager(mLayoutManager);
        enrolList.setItemAnimator(new DefaultItemAnimator());
        enrolList.setAdapter(enrolmentInformationAdapter);
        return view;

    }


    }

