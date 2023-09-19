package com.example.gametiktok

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.LinearInterpolator
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    private lateinit var pbHeathMonster: ProgressBar
    private lateinit var pbHeathCharacter: ProgressBar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pbHeathMonster = findViewById(R.id.pbHeathMonster)
        pbHeathCharacter = findViewById(R.id.pbHeathCharacter)

        decreasedBloodMonster()
        decreasedBloodCharacter()
    }

    private fun decreasedBloodMonster(){
        // Create ObjectAnimator to run backwards from 100% to 0%
        val animation = ObjectAnimator.ofInt(pbHeathMonster, "progress", 0)
        animation.duration = 5000 // Animation runtime (5 seconds)
        animation.interpolator = LinearInterpolator()
        animation.start()
    }
    private fun decreasedBloodCharacter(){
        // Create ObjectAnimator to run backwards from 100% to 0%
        val animation = ObjectAnimator.ofInt(pbHeathCharacter, "progress", 0)
        animation.duration = 5000 // Animation runtime (5 seconds)
        animation.interpolator = LinearInterpolator()
        animation.start()
    }
}