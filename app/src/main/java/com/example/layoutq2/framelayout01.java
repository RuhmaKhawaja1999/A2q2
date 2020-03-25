package com.example.layoutq2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class framelayout01 extends AppCompatActivity {
    private Button b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.framelayout01);
        b3= (Button) findViewById(R.id.Login);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3= new Intent(framelayout01.this,MainActivity.class);
                startActivity(intent3);
            }

        });
    }
}

