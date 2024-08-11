package com.example.kotlinkreatorsproject.Repository

import com.example.kotlinkreatorsproject.Model.CardModel
import com.example.kotlinkreatorsproject.R

class CardItemsRepository {
   val cardItems = mutableListOf(
       CardModel(R.drawable.card,R.drawable.visa,"Platinum","Rendy Vickriansyah","14160212"),
       CardModel(R.drawable.card_2,R.drawable.visa,"Platinum","Rendy Vickriansyah","14160212"),
       CardModel(R.drawable.card,R.drawable.visa,"Platinum","Rendy Vickriansyah","14160212"),
       CardModel(R.drawable.card_2,R.drawable.visa,"Platinum","Rendy Vickriansyah","14160212"),
   )
}