package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up click listeners for all profile options
        setupProfileClickListeners()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    private fun setupProfileClickListeners() {
        // Order History
        val orderHistoryRow = findViewById<View>(R.id.row_order_history)
        orderHistoryRow?.setOnClickListener {
            val intent = Intent(this, OrderHistoryActivity::class.java)
            startActivity(intent)
        }
        
        // Saved Addresses
        val savedAddressesRow = findViewById<View>(R.id.row_saved_addresses)
        savedAddressesRow?.setOnClickListener {
            val intent = Intent(this, SavedAddressesActivity::class.java)
            startActivity(intent)
        }
        
        // Payment Methods
        val paymentMethodsRow = findViewById<View>(R.id.row_payment_methods)
        paymentMethodsRow?.setOnClickListener {
            val intent = Intent(this, PaymentMethodsActivity::class.java)
            startActivity(intent)
        }
        
        // Notifications
        val notificationsRow = findViewById<View>(R.id.row_notifications)
        notificationsRow?.setOnClickListener {
            val intent = Intent(this, NotificationsActivity::class.java)
            startActivity(intent)
        }
        
        // Help & Support
        val helpSupportRow = findViewById<View>(R.id.row_help_support)
        helpSupportRow?.setOnClickListener {
            val intent = Intent(this, HelpSupportActivity::class.java)
            startActivity(intent)
        }
        
        // Terms & Privacy
        val termsPrivacyRow = findViewById<View>(R.id.row_terms_privacy)
        termsPrivacyRow?.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onBackPressed() {
        // Go back to main activity
        finish()
    }
}
