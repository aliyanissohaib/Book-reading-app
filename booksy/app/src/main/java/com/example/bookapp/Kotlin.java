package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Kotlin extends AppCompatActivity {
    PDFView kotlin_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kotlin);
        kotlin_pdf= findViewById(R.id.kotlin_pdf);
        kotlin_pdf.fromAsset("kotlin.pdf").load();
    }
}