package com.example.student.frgment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.R;
import com.example.student.adapter.Attendancedapter;
import com.example.student.adapter.EnrolmentInformationAdapter;

public class StudentAttendenceFragment extends Fragment
{
    Spinner cource_sp,batch_sp,attendnce_sp;
    ArrayAdapter<String> adapter1;
    RecyclerView attendanc_rv;
    String[] stringList={"session1","session2","session3"};
    Attendancedapter mAttendancedapter;

    public StudentAttendenceFragment(){
        // require a empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.student_attendence, container, false);
        cource_sp=view.findViewById(R.id.spinner);
        batch_sp=view.findViewById(R.id.spinner_1);
        attendnce_sp=view.findViewById(R.id.spinner_2);
        attendanc_rv=view.findViewById(R.id.recycler_view);
        adapter1 = new ArrayAdapter<>(getContext(), android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.adp_salutation));
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        cource_sp.setAdapter(adapter1);
        cource_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        batch_sp.setAdapter(adapter1);
        batch_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        attendnce_sp.setAdapter(adapter1);
        attendnce_sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        mAttendancedapter=new Attendancedapter(getContext(),stringList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getContext());
        attendanc_rv.setLayoutManager(mLayoutManager);
        attendanc_rv.setItemAnimator(new DefaultItemAnimator());
        attendanc_rv.setAdapter(mAttendancedapter);

        return view;

    }


}


