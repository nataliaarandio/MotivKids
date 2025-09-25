package com.example.motivkids

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent

class SelectedActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selected)

        val btnStart = findViewById<Button>(R.id.btnStartActivity)

        btnStart.setOnClickListener {
            val intent = Intent(this, RealizarActivity::class.java)
            startActivity(intent)
        }


    }



}