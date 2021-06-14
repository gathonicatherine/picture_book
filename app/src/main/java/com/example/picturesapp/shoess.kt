package com.example.picturesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shoess : AppCompatActivity() {
    lateinit var button10:Button
    lateinit var button11:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoess)
        button10=findViewById(R.id.button10)
        button11=findViewById(R.id.button11)
        button11.setOnClickListener {
            val intent= Intent(baseContext,Shoee::class.java)
        }
    }
}