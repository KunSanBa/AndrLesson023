package com.aleksandrkunevich.android.andrlesson023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.data.Card
import com.aleksandrkunevich.android.andrlesson023.databinding.CardItemBinding

class CardHolder(item: View) : RecyclerView.ViewHolder(item) {

    private val binding = CardItemBinding.bind(item)

    companion object {

        fun from(parent: ViewGroup): CardHolder {
            return CardHolder(
                LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
            )
        }
    }

//    private val modelTextView: TextView by lazy { item.findViewById(R.id.cardItemModel) }
//    private val priceTextView: TextView by lazy { item.findViewById(R.id.cardItemPrice) }

    fun bind(item: Card) {
        binding.cardItemModel.text = item.model
        binding.cardItemPrice.text = item.price.toString()
//        modelTextView.text = item.model
//        priceTextView.text = item.price.toString()
    }
}