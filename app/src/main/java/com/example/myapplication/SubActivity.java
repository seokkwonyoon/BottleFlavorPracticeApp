package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);


        Button Btn2 = findViewById(R.id.Btn2);
        Btn2.setOnClickListener(new View.OnClickListener(){

            @Override
                    public void onClick(View view){
                Log.d("log", "o");
            }
        });

        findViewById(R.id.Btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SubActivity.this, MainActivity.class));
            }
        });

}

        public void Click1(View v){
            Toast.makeText( this, "Let's start", Toast.LENGTH_SHORT).show();
}
}