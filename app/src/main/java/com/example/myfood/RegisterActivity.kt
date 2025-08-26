package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        // Register button - goes to main app
        val registerButton = findViewById<View>(R.id.btn_register)
        registerButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Google register button - goes to main app
        val googleButton = findViewById<View>(R.id.btn_google_register)
        googleButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Facebook register button - goes to main app
        val facebookButton = findViewById<View>(R.id.btn_facebook_register)
        facebookButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Login link - goes to login page
        val loginLink = findViewById<View>(R.id.tv_login)
        loginLink.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    
    override fun onBackPressed() {
        // Go back to login page
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
