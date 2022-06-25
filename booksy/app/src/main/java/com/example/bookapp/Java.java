package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Java extends AppCompatActivity {
    PDFView java_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java2);

        java_pdf = findViewById(R.id.java_pdf);
        java_pdf.fromAsset("java.pdf").load();
    }
}