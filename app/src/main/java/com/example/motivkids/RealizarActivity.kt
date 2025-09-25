package com.example.motivkids

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.ImageButton
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class RealizarActivity : AppCompatActivity() {


    private lateinit var tvMinutes: TextView
    private lateinit var tvSeconds: TextView

    // Tiempo inicial → 1 minuto (60000 ms = 60 segundos)
    private val startTimeInMillis: Long = 60000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_to_do)

        // Referencias a las vistas
        tvMinutes = findViewById(R.id.tvMinutes)
        tvSeconds = findViewById(R.id.tvSeconds)

        // Actualizamos valores iniciales
        updateTimer(startTimeInMillis)

        // El cronómetro arranca de una vez
        startTimer(startTimeInMillis)

        val btnEnd = findViewById<Button>(R.id.btnFinalizar)

        btnEnd.setOnClickListener {
            val intent = Intent(this, FeedBackActivity::class.java)
            startActivity(intent)
        }
    }

    private fun startTimer(timeInMillis: Long) {
        object : CountDownTimer(timeInMillis, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                updateTimer(millisUntilFinished)
            }

            override fun onFinish() {
                tvMinutes.text = "00"
                tvSeconds.text = "00"
            }
        }.start()
    }

    private fun updateTimer(millis: Long) {
        val minutes = (millis / 1000) / 60
        val seconds = (millis / 1000) % 60

        tvMinutes.text = String.format("%02d", minutes)
        tvSeconds.text = String.format("%02d", seconds)
    }




}


