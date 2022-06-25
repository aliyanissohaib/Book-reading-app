package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;

public class MainActivity extends AppCompatActivity {

    CardView java_cv,php_cv,python_cv,web_cv,kotlin_cv,cc_cv,cp_cv,sql_cv;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        java_cv = findViewById(R.id.java_cv);
        php_cv=findViewById(R.id.php_cv);
        python_cv=findViewById(R.id.python_cv);
        web_cv=findViewById(R.id.web_cv);
        cc_cv=findViewById(R.id.cc_cv);
        cp_cv=findViewById(R.id.cp_cv);
        sql_cv=findViewById(R.id.sql_cv);
        kotlin_cv=findViewById(R.id.kotlin_cv);

        java_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent javaIntent = new Intent(MainActivity.this,Java.class);
                startActivity(javaIntent);
            }
        });
        php_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent phpIntent = new Intent(MainActivity.this,Php.class);
                startActivity(phpIntent);
            }
        });
        python_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pythonIntent = new Intent(MainActivity.this,Python.class);
                startActivity(pythonIntent);
            }
        });
        web_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent = new Intent(MainActivity.this,Web.class);
                startActivity(webIntent);
            }
        });
        kotlin_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent kotlinIntent = new Intent(MainActivity.this,Kotlin.class);
                startActivity(kotlinIntent);
            }
        });
        sql_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sqlIntent = new Intent(MainActivity.this,Sql.class);
                startActivity(sqlIntent);
            }
        });
        cp_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cpIntent = new Intent(MainActivity.this,Cp.class);
                startActivity(cpIntent);
            }
        });
        cc_cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ccIntent = new Intent(MainActivity.this,Cc.class);
                startActivity(ccIntent);
            }
        });


    }
}