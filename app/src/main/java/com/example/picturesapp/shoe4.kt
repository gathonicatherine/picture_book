package com.example.picturesapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shoe4 : AppCompatActivity() {
    lateinit var button7:Button
    lateinit var button6:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe2)
        button7=findViewById(R.id.button7)
        button6=findViewById(R.id.button6)
    }
}