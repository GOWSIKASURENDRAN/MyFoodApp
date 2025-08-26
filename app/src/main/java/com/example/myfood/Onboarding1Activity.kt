package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class Onboarding1Activity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding_1)
        
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
        
        // Next button - goes to onboarding page 2
        val nextButton = findViewById<View>(R.id.btn_next)
        nextButton.setOnClickListener {
            val intent = Intent(this, Onboarding2Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
    
    override fun onBackPressed() {
        // Go back to splash screen
        val intent = Intent(this, SplashActivity::class.java)
        startActivity(intent)
        finish()
    }
}
