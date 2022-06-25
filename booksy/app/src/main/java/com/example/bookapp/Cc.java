package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Cc extends AppCompatActivity {
    PDFView cc_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cc);
        cc_pdf= findViewById(R.id.cc_pdf);
        cc_pdf.fromAsset("cc.pdf").load();
    }
}