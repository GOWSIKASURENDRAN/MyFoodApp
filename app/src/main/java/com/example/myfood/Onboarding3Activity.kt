package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Onboarding3Activity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_3)
        
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
        
        // Previous button - goes back to onboarding page 2
        val previousButton = findViewById<View>(R.id.btn_previous)
        previousButton.setOnClickListener {
            val intent = Intent(this, Onboarding2Activity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Get Started button - goes to login
        val getStartedButton = findViewById<View>(R.id.btn_get_started)
        getStartedButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    
    override fun onBackPressed() {
        // Go back to onboarding page 2
        val intent = Intent(this, Onboarding2Activity::class.java)
        startActivity(intent)
        finish()
    }
}
