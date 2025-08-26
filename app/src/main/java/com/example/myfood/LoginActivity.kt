package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        // Forgot password link - goes to forgot password page
        val forgotPasswordLink = findViewById<View>(R.id.tv_forgot_password)
        forgotPasswordLink?.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }
        
        // Login button - goes to main app
        val loginButton = findViewById<View>(R.id.btn_login)
        loginButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Google login button - goes to main app
        val googleButton = findViewById<View>(R.id.btn_google_login)
        googleButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Facebook login button - goes to main app
        val facebookButton = findViewById<View>(R.id.btn_facebook_login)
        facebookButton?.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Sign up link - goes to register page
        val signUpLink = findViewById<View>(R.id.tv_sign_up)
        signUpLink?.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onBackPressed() {
        // Go back to onboarding page 1
        val intent = Intent(this, Onboarding1Activity::class.java)
        startActivity(intent)
        finish()
    }
}

