package com.example.picturesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class shoe3 : AppCompatActivity() {
    lateinit var btnshoe3:Button
    lateinit var btnshoee3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoe3)
        btnshoe3=findViewById(R.id.btnshoe3)
        btnshoee3=findViewById(R.id.btnshoee3)
        btnshoe3.setOnClickListener {
            val intent=Intent(baseContext,shoe1::class.java)
            startActivity(intent)
        }
    }
}