package com.example.administrator.zhaoshuting_1507b;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public final static  String TAG="NEXT";
    Button bnt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initBnt();

        Intent intent = getIntent();

        String stringExtra = intent.getStringExtra(MainActivity.TAG);

        Toast.makeText(this,stringExtra,Toast.LENGTH_LONG).show();


    }

    private void initBnt() {
        bnt= (Button) findViewById(R.id.next);

        bnt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

//                            Intent in=new Intent(MainActivity.this,Main2Activity.class);


                Intent intent=null;

                intent=new Intent();

                intent.setClass(MainActivity.this,Main2Activity.class);

                intent.putExtra(TAG,"success");

                startActivity(intent);
            }
        });
    }
}
