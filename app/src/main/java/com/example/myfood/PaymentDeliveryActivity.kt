package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class PaymentDeliveryActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_delivery)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up Place Order button click listener
        setupPlaceOrderButton()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    private fun setupPlaceOrderButton() {
        val placeOrderButton = findViewById<Button>(R.id.btn_place_order)
        placeOrderButton.setOnClickListener {
            // Navigate to Order Confirmation screen
            val intent = Intent(this, OrderConfirmationActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onBackPressed() {
        // Go back to cart checkout
        finish()
    }
}
