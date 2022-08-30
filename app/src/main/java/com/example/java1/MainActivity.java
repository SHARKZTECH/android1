package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void disable(View v){
        v.setEnabled(false);
        Button b=(Button) v;
        b.setText("Disabled");

        EditText inp=findViewById(R.id.input);
        String text=inp.getText().toString();
        inp.setText("");

        View txt=findViewById(R.id.text);
        TextView textView=(TextView) txt;
        textView.setText(text);

    }
}