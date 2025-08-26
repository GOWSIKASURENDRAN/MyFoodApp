package com.example.myfood.utils

import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity

object BackPressHandler {
    
    /**
     * Sets up back press handling for an activity
     * @param activity The activity to set up back press handling for
     * @param onBackPressed The action to perform when back is pressed
     */
    fun setupBackPress(activity: AppCompatActivity, onBackPressed: () -> Unit) {
        activity.onBackPressedDispatcher.addCallback(activity, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                onBackPressed()
            }
        })
    }
    
    /**
     * Sets up back press handling that simply finishes the activity
     * @param activity The activity to set up back press handling for
     */
    fun setupBackPressToFinish(activity: AppCompatActivity) {
        setupBackPress(activity) {
            activity.finish()
        }
    }
    
    /**
     * Sets up back press handling that minimizes the app (for main activity)
     * @param activity The activity to set up back press handling for
     */
    fun setupBackPressToMinimize(activity: AppCompatActivity) {
        setupBackPress(activity) {
            activity.moveTaskToBack(true)
        }
    }
}
