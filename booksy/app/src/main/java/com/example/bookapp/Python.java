package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Python extends AppCompatActivity {
PDFView python_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_python);
        python_pdf= findViewById(R.id.python_pdf);
        python_pdf.fromAsset("Python.pdf").load();
    }
}