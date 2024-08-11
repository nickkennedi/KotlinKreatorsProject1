package com.example.kotlinkreatorsproject.View

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinkreatorsproject.databinding.ActivityCardInfoBinding

class CardInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        
        
    }
}