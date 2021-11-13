package com.example.ca2_harsh_gupta

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1=findViewById<Button>(R.id.Q1)
        val btn2=findViewById<Button>(R.id.Q2)
        btn1.setOnClickListener {
            val intent_1= Intent(this,Q1::class.java)
            startActivity(intent_1)
        }
        btn2.setOnClickListener {
            val intent_2= Intent(this,Q2::class.java)
            startActivity(intent_2)
        }
    }
}