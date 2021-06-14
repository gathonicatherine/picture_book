package com.example.picturesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shoe1 : AppCompatActivity() {
    lateinit var button4:Button
    lateinit var button5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe1)
        button4=findViewById(R.id.button4)
        button5=findViewById(R.id.button5)
        button5.setOnClickListener {
            val intent= Intent(baseContext,Shoes::class.java)
            startActivity(intent)
        }
    }
}