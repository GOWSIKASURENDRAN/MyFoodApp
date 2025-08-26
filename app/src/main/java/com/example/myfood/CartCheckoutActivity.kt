package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.myfood.utils.BackPressHandler

class CartCheckoutActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_checkout)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up Proceed to Checkout button click listener
        setupCheckoutButton()
        
        // Set up back press handling
        BackPressHandler.setupBackPressToFinish(this)
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            finish()
        }
    }
    
    private fun setupCheckoutButton() {
        val checkoutButton = findViewById<Button>(R.id.btn_proceed_checkout)
        checkoutButton.setOnClickListener {
            // Navigate to Payment & Delivery screen
            val intent = Intent(this, PaymentDeliveryActivity::class.java)
            startActivity(intent)
        }
    }
}
