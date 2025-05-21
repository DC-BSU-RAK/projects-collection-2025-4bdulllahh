package com.example.mysupercarapp

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val logoLamborghini = findViewById<ImageView>(R.id.logo_lamborghini)
        val logoFerrari = findViewById<ImageView>(R.id.logo_ferrari)
        val logoMcLaren = findViewById<ImageView>(R.id.logo_mclaren)
        val logoBugatti = findViewById<ImageView>(R.id.logo_bugatti)
        val logoAstonMartin = findViewById<ImageView>(R.id.logo_astonmartin)
        val logoPorsche = findViewById<ImageView>(R.id.logo_porsche)

        logoLamborghini.setOnClickListener {
            startActivity(Intent(this, LamborghiniActivity::class.java))
        }

        logoFerrari.setOnClickListener {
            startActivity(Intent(this, FerrariActivity::class.java))
        }

        logoMcLaren.setOnClickListener {
            startActivity(Intent(this, McLarenActivity::class.java))
        }

        logoBugatti.setOnClickListener {
            startActivity(Intent(this, BugattiActivity::class.java))
        }

        logoAstonMartin.setOnClickListener {
            startActivity(Intent(this, AstonMartinActivity::class.java))
        }

        logoPorsche.setOnClickListener {
            startActivity(Intent(this, PorscheActivity::class.java))
        }
    }
}
