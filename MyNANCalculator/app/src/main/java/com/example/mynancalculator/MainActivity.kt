package com.example.mynancalculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val moods = listOf("Happy", "Sad", "Anxious", "Calm", "Excited", "Angry", "Tired", "Bored")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Show modal popup
        AlertDialog.Builder(this)
            .setTitle("How to Use")
            .setMessage("Pick two moods and tap 'Mix Moods' to see your combined vibe!")
            .setPositiveButton("OK", null)
            .show()

        val spinner1: Spinner = findViewById(R.id.spinnerMood1)
        val spinner2: Spinner = findViewById(R.id.spinnerMood2)
        val mixButton: Button = findViewById(R.id.btnCalculate)
        val resultText: TextView = findViewById(R.id.resultText)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, moods)
        spinner1.adapter = adapter
        spinner2.adapter = adapter

        mixButton.setOnClickListener {
            val mood1 = spinner1.selectedItem.toString()
            val mood2 = spinner2.selectedItem.toString()
            val result = mixMoods(mood1, mood2)
            resultText.text = result
        }
    }

    private fun mixMoods(mood1: String, mood2: String): String {
        return when (setOf(mood1, mood2)) {
            setOf("Happy", "Anxious") -> "Cautious Optimism 😬🙂"
            setOf("Sad", "Calm") -> "Quiet Reflection 😌😢"
            setOf("Excited", "Tired") -> "Burnt Out Buzz 😴⚡"
            setOf("Angry", "Calm") -> "Barely Holding It In 😤😮‍💨"
            setOf("Bored", "Happy") -> "Low-Key Content 😐🙂"
            setOf("Happy", "Sad") -> "Bittersweet 😊😢"
            setOf("Excited", "Anxious") -> "Nervous Energy 😬🎉"
            setOf("Calm", "Tired") -> "Peaceful Drowsiness 🛌😌"
            setOf("Angry", "Tired") -> "Irritable Fatigue 😡😩"
            setOf("Happy", "Calm") -> "Contentment 🌞😌"
            setOf("Sad", "Tired") -> "Emotional Exhaustion 😓💤"
            setOf("Excited", "Happy") -> "Pure Joy 😄🎈"
            setOf("Angry", "Sad") -> "Frustrated Sorrow 😠😭"
            setOf("Bored", "Tired") -> "Mentally Drained 🥱😑"
            setOf("Bored", "Anxious") -> "Unsettled Ennui 😐😰"
            setOf("Calm", "Anxious") -> "Tense Stillness 😶‍🌫️"
            setOf("Happy", "Angry") -> "Forced Smile 😁😡"
            setOf("Excited", "Bored") -> "Overstimulated Yet Meh 😵😒"
            setOf("Sad", "Anxious") -> "Worried Blues 🌧️😟"
            setOf("Excited", "Calm") -> "Focused Drive 🚀🧘"
            setOf("Bored", "Sad") -> "Hopeless Laziness 😞😔"
            setOf("Angry", "Excited") -> "Charged Rage 💢⚡"
            setOf("Anxious", "Tired") -> "Worn-Out Worry 😩😰"
            setOf("Happy", "Tired") -> "Sleepy Smile 😴😊"
            setOf("Bored", "Angry") -> "Fed-Up 😤😒"
            else -> "$mood1 + $mood2 = Unique Mood 💡"
        }
    }
}