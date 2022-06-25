package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Web extends AppCompatActivity {
    PDFView web_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        web_pdf= findViewById(R.id.web_pdf);
        web_pdf.fromAsset("web.pdf").load();
    }
}