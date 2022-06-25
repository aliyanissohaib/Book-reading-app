package com.example.bookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Php extends AppCompatActivity {
    PDFView php_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php);
        php_pdf= findViewById(R.id.php_pdf);
        php_pdf.fromAsset("Php.pdf").load();
    }
}