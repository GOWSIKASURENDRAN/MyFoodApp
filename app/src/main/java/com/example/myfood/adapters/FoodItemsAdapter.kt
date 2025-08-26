package com.example.myfood.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myfood.R
import com.example.myfood.models.FoodItem

class FoodItemsAdapter(
    private val foodItems: List<FoodItem>
) : RecyclerView.Adapter<FoodItemsAdapter.FoodItemViewHolder>() {

    class FoodItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foodImage: ImageView = itemView.findViewById(R.id.iv_food_image)
        val foodName: TextView = itemView.findViewById(R.id.tv_food_name)
        val foodDescription: TextView = itemView.findViewById(R.id.tv_food_description)
        val foodPrice: TextView = itemView.findViewById(R.id.tv_food_price)
        val addButton: Button = itemView.findViewById(R.id.btn_add_food)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_food, parent, false)
        return FoodItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        val foodItem = foodItems[position]
        
        holder.foodImage.setImageResource(foodItem.imageResId)
        holder.foodName.text = foodItem.name
        holder.foodDescription.text = foodItem.description
        holder.foodPrice.text = foodItem.price
        
        holder.addButton.setOnClickListener {
            // TODO: Implement add to cart functionality
            // For now, just show a simple click effect
        }
    }

    override fun getItemCount(): Int = foodItems.size
}
