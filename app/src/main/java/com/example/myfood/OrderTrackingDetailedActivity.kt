package com.example.myfood

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OrderTrackingDetailedActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_tracking_detailed)
        
        // Set up back arrow click listener
        setupBackArrow()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    override fun onBackPressed() {
        // Go back to order confirmation
        finish()
    }
}
