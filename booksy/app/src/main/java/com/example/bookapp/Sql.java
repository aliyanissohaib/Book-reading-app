package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Sql extends AppCompatActivity {
    PDFView sql_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sql);
        sql_pdf= findViewById(R.id.sql_pdf);
        sql_pdf.fromAsset("sql.pdf").load();
    }
}