package com.example.picturesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Shoes : AppCompatActivity() {
    lateinit var button3:Button
    lateinit var button2:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoes)
        button3=findViewById(R.id.button3)
        button2=findViewById(R.id.button2)
        button3.setOnClickListener {
            val intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }
    }

}