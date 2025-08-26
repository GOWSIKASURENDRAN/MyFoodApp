package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CheckoutActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_checkout)
        
        // Set up Place Order button click listener
        setupPlaceOrderButton()
    }
    
    private fun setupPlaceOrderButton() {
        val placeOrderButton = findViewById<Button>(R.id.btn_place_order)
        placeOrderButton.setOnClickListener {
            // Navigate to Order Tracking screen
            val intent = Intent(this, OrderTrackingActivity::class.java)
            startActivity(intent)
        }
    }
}
