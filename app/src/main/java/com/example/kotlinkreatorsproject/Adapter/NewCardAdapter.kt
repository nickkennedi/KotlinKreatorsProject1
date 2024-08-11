package com.example.kotlinkreatorsproject.Adapter

import android.os.Build
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinkreatorsproject.Model.CardModel
import com.example.kotlinkreatorsproject.databinding.CardItemHolderBinding

class NewCardAdapter( private val cardList: List<CardModel> ) : RecyclerView.Adapter<NewCardAdapter.NewCardViewHolder>() {
    
    class NewCardViewHolder( val binding: CardItemHolderBinding) : RecyclerView.ViewHolder(binding.root)
    
    override fun onCreateViewHolder(
        p0: ViewGroup,
        p1: Int
    ): NewCardAdapter.NewCardViewHolder {
        val context = p0.context
        val binding = CardItemHolderBinding.inflate(android.view.LayoutInflater.from(context), p0, false)
        return NewCardViewHolder(binding)
        
    }
    
    @RequiresApi(Build.VERSION_CODES.N)
    override fun onBindViewHolder(p0: NewCardAdapter.NewCardViewHolder, p1: Int) {
        
        val item = cardList[p1]
        p0.binding.card1.setImageResource(item.cardBackground)
        p0.binding.cardLogo.setImageResource(item.cardLogo)
        p0.binding.cardType.text = item.cardType
        p0.binding.cardUser.text = item.cardUser
        p0.binding.cardNumber.text = item.cardNumber
        
        
        
        
        
    }
    
    override fun getItemCount(): Int = cardList.size
    
    
}