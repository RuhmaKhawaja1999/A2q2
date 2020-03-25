package com.example.layoutq2;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
public class screen02 extends AppCompatActivity{


    private Button b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen02);
        b2= (Button) findViewById(R.id.submit);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intt= new Intent(screen02.this,framelayout01.class);
                startActivity(intt);
            }
        });
    }
}
