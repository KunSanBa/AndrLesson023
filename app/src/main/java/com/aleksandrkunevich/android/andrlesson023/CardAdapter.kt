package com.aleksandrkunevich.android.andrlesson023

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.data.Card

class CardAdapter : RecyclerView.Adapter<CardHolder>() {

    private val cardList: MutableList<Card> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {
        return CardHolder.from(parent)
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {
        holder.bind(cardList[position])
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    fun addCard(card: Card){
        cardList.add(card)
        notifyDataSetChanged()
    }
}