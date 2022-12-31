package com.varadasainikhil.counterapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var count = 0
        val btnINC = findViewById<Button>(R.id.buttonINC)
        val btnDEC = findViewById<Button>(R.id.buttonDEC)
        val output = findViewById<TextView>(R.id.output)

        btnINC.setOnClickListener(){
            count++
            output.text = "COUNT = $count"
        }

        btnDEC.setOnClickListener(){
            count--
            output.text = "COUNT = $count"
        }


    }
}