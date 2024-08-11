package com.example.kotlinkreatorsproject.View

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinkreatorsproject.databinding.ActivityCardInfoBinding

class CardInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardInfoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // retira a safe area da tela
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        
    }
}