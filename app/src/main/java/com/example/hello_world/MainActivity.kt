package com.example.hello_world

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import  android.widget.Button
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    val btnSayHello = findViewById<Button>(R.id.btnSayHello)

        btnSayHello.setOnClickListener{
            Log.v("Hello world", "Hello world button clicked")
//            this is like a modal it display the specified text for the specified duration
            Toast.makeText(this, "Hello to you too", Toast.LENGTH_SHORT).show()
        }
    }
}