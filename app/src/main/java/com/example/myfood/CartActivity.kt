package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)
        
        // Set up Proceed to Checkout button click listener
        setupCheckoutButton()
    }
    
    private fun setupCheckoutButton() {
        val checkoutButton = findViewById<Button>(R.id.btn_checkout)
        checkoutButton.setOnClickListener {
            // Navigate to Checkout screen
            val intent = Intent(this, CheckoutActivity::class.java)
            startActivity(intent)
        }
    }
}
