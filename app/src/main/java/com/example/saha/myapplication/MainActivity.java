package com.example.saha.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"welcome" ,Toast.LENGTH_LONG);
        Toast.makeText(this,"to " ,Toast.LENGTH_LONG);
        Toast.makeText(this,"git" ,Toast.LENGTH_LONG);
        Toast.makeText(this,"hub" ,Toast.LENGTH_LONG);

    }
}
