package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        
        setupClickListeners()
    }
    
    private fun setupClickListeners() {
        // Back button - goes back to login
        val backButton = findViewById<View>(R.id.tv_back)
        backButton.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Reset password button - shows success and goes to login
        val resetButton = findViewById<View>(R.id.btn_reset_password)
        resetButton.setOnClickListener {
            // TODO: Show success message
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
        
        // Back to login link - goes to login page
        val backToLoginLink = findViewById<View>(R.id.tv_back_to_login)
        backToLoginLink.setOnClickListener {
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
