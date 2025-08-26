package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class OrderConfirmationActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_order_confirmation)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up Track Order button click listener
        setupTrackOrderButton()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    private fun setupTrackOrderButton() {
        val trackOrderButton = findViewById<Button>(R.id.btn_track_order)
        trackOrderButton.setOnClickListener {
            // Navigate to detailed Order Tracking screen
            val intent = Intent(this, OrderTrackingDetailedActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onBackPressed() {
        // Go back to main activity
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
        startActivity(intent)
        finish()
    }
}
