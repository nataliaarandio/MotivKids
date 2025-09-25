package com.example.motivkids
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import com.google.android.material.card.MaterialCardView

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)


        val cardEmociones = findViewById<MaterialCardView>(R.id.cardEmociones)

        cardEmociones.setOnClickListener {
            // Aquí decides qué hacer
            // Por ejemplo: ir a la pantalla de emociones
            val intent = Intent(this, EmotionSelect::class.java)
            startActivity(intent)
        }
    }
}