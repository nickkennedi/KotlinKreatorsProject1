package com.example.kotlinkreatorsproject.View

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinkreatorsproject.R
import com.example.kotlinkreatorsproject.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySplashScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.button.setOnClickListener {
            
            val intent = Intent(this, CardInfoActivity::class.java)
            startActivity(intent)
            
        }

    }
}