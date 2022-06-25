package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Cp extends AppCompatActivity {
    PDFView cp_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cp);
        cp_pdf= findViewById(R.id.cp_pdf);
        cp_pdf.fromAsset("cp.pdf").load();
    }
}