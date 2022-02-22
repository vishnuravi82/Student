package com.example.student;

import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.student.adapter.EnrolmentInformationAdapter;
import com.example.student.utilles.CustomTypefaceSpan;


public class EnrolementInformationActivity extends AppCompatActivity {
    String[] stringList={"helo","hi"};
    EnrolmentInformationAdapter enrolmentInformationAdapter;
    RecyclerView enrolList;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_information);
        enrolList=findViewById(R.id.recycler_view);
        setUpActionBar("Student Dtails");
        enrolmentInformationAdapter=new EnrolmentInformationAdapter(this,stringList);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        enrolList.setLayoutManager(mLayoutManager);
        enrolList.setItemAnimator(new DefaultItemAnimator());
        enrolList.setAdapter(enrolmentInformationAdapter);

    }

    private void setUpActionBar(String title) {
      //  Typeface font = Typeface.createFromAsset(this.getAssets(), "fonts/BrandonText_Bold.otf");
        SpannableStringBuilder ssb = new SpannableStringBuilder(title);
      //  ssb.setSpan(new CustomTypefaceSpan("", font), 0, ssb.length(), Spanned.SPAN_EXCLUSIVE_INCLUSIVE);
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
