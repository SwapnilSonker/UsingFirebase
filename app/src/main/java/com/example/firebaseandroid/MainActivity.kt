package com.example.firebaseandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar

class MainActivity : AppCompatActivity() {
    private var clicknum =0
    private lateinit var textview : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //setSupportActionBar(toolbar)
        textview = findViewById<TextView>(R.id.textView)
        val btn = findViewById<Button>(R.id.button)

        btn.setOnClickListener{
            clicknum++
            textview.text = "I have clicked on this"
        }
    }
}