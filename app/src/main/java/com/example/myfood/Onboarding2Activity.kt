package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Onboarding2Activity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_2)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        // Skip button - goes directly to login
        val skipButton = findViewById<View>(R.id.tv_skip)
        skipButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Previous button - goes back to onboarding page 1
        val previousButton = findViewById<View>(R.id.btn_previous)
        previousButton.setOnClickListener {
            val intent = Intent(this, Onboarding1Activity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Next button - goes to onboarding page 3
        val nextButton = findViewById<View>(R.id.btn_next)
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboarding3Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
    
    override fun onBackPressed() {
        // Go back to onboarding page 1
        val intent = Intent(this, Onboarding1Activity::class.java)
        startActivity(intent)
        finish()
    }
}
