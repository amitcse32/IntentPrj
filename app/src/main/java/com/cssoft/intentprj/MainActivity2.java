package com.cssoft.intentprj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        String data=getIntent().getStringExtra("x");
        TextView textView=findViewById(R.id.textViewData);
        textView.setText(data);

    }
}
