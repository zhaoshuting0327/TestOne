package com.example.administrator.zhaoshuting_1507b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    Button bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

         String stringExtra = intent.getStringExtra(MainActivity.TAG);

        Toast.makeText(this,stringExtra,Toast.LENGTH_LONG).show();

        initButton();










    }

    private void initButton() {

        bnt= (Button) findViewById(R.id.back);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent in=new Intent(Main2Activity.this,MainActivity.class);

                in.putExtra(MainActivity.TAG,"我回来了");

                startActivity(in);

            }
        });
    }
}
