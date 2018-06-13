package com.cssoft.intentprj;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void navigate(View view) {
        EditText editText = findViewById(R.id.editTextData);
        String value = editText.getText().toString();

        Intent intent=new Intent(this,MainActivity2.class);
        intent.putExtra("x",value);
        startActivity(intent);



    }


}
