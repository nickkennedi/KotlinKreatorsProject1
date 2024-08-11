package com.example.kotlinkreatorsproject.View

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinkreatorsproject.Adapter.NewCardAdapter
import com.example.kotlinkreatorsproject.ViewModel.CardItemViewModel
import com.example.kotlinkreatorsproject.databinding.ActivityCardInfoBinding

class CardInfoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCardInfoBinding
    private val viewModel: CardItemViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCardInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        // retira a safe area da tela
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )
        
        initRecycleView()
        
        
    }
    
    private fun initRecycleView() {
        binding.rvCards.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvCards.adapter = NewCardAdapter(viewModel.loadData()) // Set the adapter for the RecyclerView
        binding.rvCards.isNestedScrollingEnabled = false

    }
}