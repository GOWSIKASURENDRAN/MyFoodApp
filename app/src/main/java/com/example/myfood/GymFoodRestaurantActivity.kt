package com.example.myfood

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myfood.adapters.FoodItemsAdapter
import com.example.myfood.models.FoodItem

class GymFoodRestaurantActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gym_food_restaurant)
        
        // Set up back arrow click listener
        setupBackArrow()
        
        // Set up RecyclerView with healthy food items
        setupHealthyFoodItemsList()
        
        // Set up View Cart button click listener
        setupViewCartButton()
    }
    
    private fun setupBackArrow() {
        val backArrow = findViewById<ImageView>(R.id.iv_back_arrow)
        backArrow?.setOnClickListener {
            onBackPressed()
        }
    }
    
    private fun setupHealthyFoodItemsList() {
        val recyclerView = findViewById<RecyclerView>(R.id.rv_food_items)
        recyclerView.layoutManager = LinearLayoutManager(this)
        
        // Healthy food items data - Sugar-free, high protein, low carb
        val healthyFoodItems = listOf(
            FoodItem("Grilled Chicken Breast", "Lean protein with herbs, no added sugar, perfect for muscle building", "$15.99", R.drawable.ic_food_category),
            FoodItem("Salmon Quinoa Bowl", "Omega-3 rich salmon with protein-packed quinoa and steamed vegetables", "$18.99", R.drawable.ic_food_category),
            FoodItem("Protein Power Smoothie", "Whey protein, almond milk, berries, no added sugar, 25g protein", "$8.99", R.drawable.ic_food_category),
            FoodItem("Turkey Avocado Wrap", "Lean turkey, fresh avocado, whole grain wrap, low carb", "$12.99", R.drawable.ic_food_category),
            FoodItem("Greek Yogurt Parfait", "High protein yogurt with nuts and berries, sugar-free", "$7.99", R.drawable.ic_food_category),
            FoodItem("Egg White Omelette", "Protein-rich egg whites with spinach and mushrooms", "$9.99", R.drawable.ic_food_category),
            FoodItem("Tuna Steak", "Fresh grilled tuna with steamed broccoli, high protein, low fat", "$16.99", R.drawable.ic_food_category),
            FoodItem("Protein Pancakes", "Almond flour pancakes with protein powder, sugar-free syrup", "$11.99", R.drawable.ic_food_category)
        )
        
        val adapter = FoodItemsAdapter(healthyFoodItems)
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
