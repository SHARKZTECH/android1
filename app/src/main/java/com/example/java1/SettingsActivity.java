package com.example.java1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        Intent i=getIntent();
        String name=i.getStringExtra("Name");

        TextView txtView=findViewById(R.id.textView);
        txtView.setText(name);
    }
    public void goToMain(View v){
        Intent i=new Intent(this,MainActivity.class);
        Toast.makeText(this,"Back to Main",Toast.LENGTH_LONG).show();
        startActivity(i);
    }
}