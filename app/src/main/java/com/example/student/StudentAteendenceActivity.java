package com.example.student;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.adapter.Attendancedapter;
import com.example.student.utilles.CustomTypefaceSpan;


public class StudentAteendenceActivity extends AppCompatActivity {
    Spinner cource_sp,batch_sp,attendnce_sp;
    ArrayAdapter<String> adapter1;
    RecyclerView attendanc_rv;
    String[] stringList={"session1","session2","session3"};
    Attendancedapter mAttendancedapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_attendence);
        setUpActionBar("Student Attendance");
        cource_sp=findViewById(R.id.spinner);
        batch_sp=findViewById(R.id.spinner_1);
        attendnce_sp=findViewById(R.id.spinner_2);
        attendanc_rv=findViewById(R.id.recycler_view);
        adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, getResources().getStringArray(R.array.adp_salutation));
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

        mAttendancedapter=new Attendancedapter(this,stringList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        attendanc_rv.setLayoutManager(mLayoutManager);
        attendanc_rv.setItemAnimator(new DefaultItemAnimator());
        attendanc_rv.setAdapter(mAttendancedapter);

    }
    private void setUpActionBar(String title) {
       // Typeface font = Typeface.createFromAsset(this.getAssets(), "fonts/BrandonText_Bold.otf");
        SpannableStringBuilder ssb = new SpannableStringBuilder(title);
       // ssb.setSpan(new CustomTypefaceSpan("", font), 0, ssb.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
        getSupportActionBar().setTitle(ssb);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.colorPrimary)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
    }

}
