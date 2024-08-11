package com.example.kotlinkreatorsproject.ViewModel

import androidx.lifecycle.ViewModel
import com.example.kotlinkreatorsproject.Repository.CardItemsRepository

class CardItemViewModel( private val repository: CardItemsRepository) : ViewModel() { constructor(): this(CardItemsRepository())
    
    fun loadData() = repository.cardItems
    
    
}