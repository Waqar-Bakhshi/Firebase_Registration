package com.example.waqarcci.myfire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLOGIN, btnREG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLOGIN = (Button)findViewById(R.id.btnlogin);
        btnREG = (Button)findViewById(R.id.btnregister);

        btnREG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this,Register_Activity.class);
        startActivity(intent);

            }
        });

    }
}