package com.example.mysupercarapp

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LamborghiniActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lamborghini)

        val backBtn = findViewById<ImageButton>(R.id.btn_back)
        backBtn.setOnClickListener {
            finish() // Goes back to HomeActivity
        }
    }
}
