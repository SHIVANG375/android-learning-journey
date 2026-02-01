package com.example.day1app

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.TextView
import android.util.Log

class SecondActivity : AppCompatActivity() {
    private var isRunning = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        val tv=findViewById<TextView>(R.id.tvSecond)
        val name=intent.getStringExtra("USERNAME")
        tv.text="HELLO, $name"
        Log.d("LifeCycle","SecondActivity onCreate")

    }
    override fun onStart(){
        super.onStart()
        Log.d("SecondActivity","ON START CALLED")
    }
    override fun onResume(){
        super.onResume()
        isRunning=true
        Log.d("SecondActivity","ON RESUME CALLED Task STARTED")
    }
    override fun onPause(){
        super.onPause()
        isRunning=false
        Log.d("SecondActivity","ON PAUSE CALLED Task STOPPED")
    }
    override fun onStop(){
        super.onStop()
        Log.d("SecondActivity","ON STOP CALLED")
    }



}