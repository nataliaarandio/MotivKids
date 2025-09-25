package com.example.motivkids

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton
import android.content.Intent

class EmotionSelect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emotion)

        val btnHappy = findViewById<ImageButton>(R.id.btnFeliz)

        btnHappy.setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java)
            startActivity(intent)
        }

        val btnNormal = findViewById<ImageButton>(R.id.btnNormal)

        btnNormal.setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java)
            startActivity(intent)
        }

        val btnSad = findViewById<ImageButton>(R.id.btnSad)

        btnSad.setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java)
            startActivity(intent)
        }

        val btnCry = findViewById<ImageButton>(R.id.btnCry)

        btnCry.setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java)
            startActivity(intent)
        }

        val btnAngry = findViewById<ImageButton>(R.id.btnAngry)

        btnAngry.setOnClickListener {
            val intent = Intent(this, SelectedActivity::class.java)
            startActivity(intent)
        }
    }



}