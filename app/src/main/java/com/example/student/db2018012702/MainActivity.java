package com.example.student.db2018012702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        TextView tv = findViewById(R.id.textView);
        Spinner sp = findViewById(R.id.spinner);
        tv.setText(((TextView)sp.getSelectedView()).getText().toString());

    }
}
