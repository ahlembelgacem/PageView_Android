package com.example.travaille;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Calendar;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Calendar calendar=Calendar.getInstance();
        String currentDte = DateFormat.getDateInstance(DateFormat.FULL).format(calendar.getTime());
        TextView textView=findViewById(R.id.date);
        textView.setText(currentDte);

    }

}
