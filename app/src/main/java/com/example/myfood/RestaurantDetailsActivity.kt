package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfood.adapters.FoodItemsAdapter
import com.example.myfood.models.FoodItem

class RestaurantDetailsActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant_details)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up RecyclerView with sample food items
        setupFoodItemsList()
        
        // Set up View Cart button click listener
        setupViewCartButton()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    private fun setupFoodItemsList() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_food_items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        // Sample food items data
        val foodItems = listOf(
            FoodItem("Margherita Pizza", "Fresh mozzarella, tomato sauce, and basil on crispy crust", "$12.99", R.drawable.ic_food_category),
            FoodItem("Pepperoni Pizza", "Classic pepperoni with melted cheese and tomato sauce", "$14.99", R.drawable.ic_food_category),
            FoodItem("BBQ Chicken Pizza", "Grilled chicken with BBQ sauce and red onions", "$16.99", R.drawable.ic_food_category),
            FoodItem("Veggie Supreme", "Fresh vegetables with mozzarella and tomato sauce", "$13.99", R.drawable.ic_food_category)
        )
        
        val adapter = FoodItemsAdapter(foodItems)
        recyclerView.adapter = adapter
    }
    
    private fun setupViewCartButton() {
        val viewCartButton = findViewById<Button>(R.id.btn_view_cart)
        viewCartButton.setOnClickListener {
            // Navigate to Cart & Checkout screen
            val intent = Intent(this, CartCheckoutActivity::class.java)
            startActivity(intent)
        }
    }
    
    override fun onBackPressed() {
        // Go back to main activity
        finish()
    }
}
