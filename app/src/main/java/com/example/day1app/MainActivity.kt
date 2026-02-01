package com.example.day1app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input=  findViewById<EditText>(R.id.etInput)
        val text1 = findViewById<TextView>(R.id.tvHello)
        val button = findViewById<Button>(R.id.btnClick)

        button.setOnClickListener {
            val name = input.text.toString()
            text1.text = "Hello, $name"
        }
    }
}