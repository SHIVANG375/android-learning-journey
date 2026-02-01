package com.example.day1app

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.content.Intent
import android.util.Log
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val input=  findViewById<EditText>(R.id.etInput)
        val text1 = findViewById<TextView>(R.id.tvHello)
        val button = findViewById<Button>(R.id.btnClick)

        button.setOnClickListener {
            val name=input.text.toString()
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra("USERNAME",name)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Lifecycle", "onStart")
    }
    override fun onResume(){
        super.onResume()
        Log.d("LifeCycle","onResume")
    }
    override fun onPause() {
        super.onPause()
        Log.d("LifeCycle", "onPause")
    }
    override fun onStop(){
        super.onStop()
        Log.d("LifeCycle","onStop")
    }

}