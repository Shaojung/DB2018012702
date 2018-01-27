package com.example.student.db2018012702;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.textView);
        sp = findViewById(R.id.spinner);
    }
    public void click1(View v)
    {
        tv.setText(((TextView)sp.getSelectedView()).getText().toString());
    }
    public void click2(View v)
    {
        int s = sp.getSelectedItemPosition();
        String f[] = getResources().getStringArray(R.array.fruits);
        tv.setText(f[s]);
    }
}
