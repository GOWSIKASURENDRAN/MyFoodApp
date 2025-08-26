package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import com.example.myfood.utils.BackPressHandler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        
        // Set up click listeners for restaurant cards
        setupRestaurantCardClickListeners()
        
        // Set up click listeners for bottom navigation
        setupBottomNavigationClickListeners()
        
        // Set up back press handling
        BackPressHandler.setupBackPressToMinimize(this)
    }
    
    private fun setupRestaurantCardClickListeners() {
        // Set up individual click listeners for different restaurant types
        val restaurantCard1 = findViewById<CardView>(R.id.restaurant_card_1)
        restaurantCard1?.setOnClickListener {
            val intent = Intent(this, RestaurantDetailsActivity::class.java)
            startActivity(intent)
        }
        
        val restaurantCard2 = findViewById<CardView>(R.id.restaurant_card_2)
        restaurantCard2?.setOnClickListener {
            val intent = Intent(this, RestaurantDetailsActivity::class.java)
            startActivity(intent)
        }
        
        val restaurantCard3 = findViewById<CardView>(R.id.restaurant_card_3)
        restaurantCard3?.setOnClickListener {
            val intent = Intent(this, RestaurantDetailsActivity::class.java)
            startActivity(intent)
        }
        
        // Gym Food Restaurant - Navigate to specialized gym food activity
        val gymFoodRestaurantCard = findViewById<CardView>(R.id.gym_food_restaurant_card)
        gymFoodRestaurantCard?.setOnClickListener {
            val intent = Intent(this, GymFoodRestaurantActivity::class.java)
            startActivity(intent)
        }
    }
    
    private fun setupBottomNavigationClickListeners() {
        // Set up home tab click listener (already on home, just highlight)
        val homeTab = findViewById<View>(R.id.home_tab)
        homeTab?.setOnClickListener {
            // Already on home, just refresh or highlight
            // You can add refresh logic here if needed
        }
        
        // Set up orders tab click listener
        val ordersTab = findViewById<View>(R.id.orders_tab)
        ordersTab?.setOnClickListener {
            // Navigate to Order History screen
            val intent = Intent(this, OrderHistoryActivity::class.java)
            startActivity(intent)
        }
        
        // Set up cart tab click listener
        val cartTab = findViewById<View>(R.id.cart_tab)
        cartTab?.setOnClickListener {
            // Navigate to Cart & Checkout screen
            val intent = Intent(this, CartCheckoutActivity::class.java)
            startActivity(intent)
        }
        
        // Set up profile tab click listener
        val profileTab = findViewById<View>(R.id.profile_tab)
        profileTab?.setOnClickListener {
            // Navigate to Profile screen
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
    }
}