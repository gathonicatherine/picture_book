package com.example.picturesapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Shoee : AppCompatActivity() {
    lateinit var button7:Button
    lateinit var button9:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shoee)
        button7=findViewById(R.id.button7)
        button9=findViewById(R.id.button9)
        button7.setOnClickListener {
            val intent= Intent(baseContext,shoe1::class.java)
        }
    }
}