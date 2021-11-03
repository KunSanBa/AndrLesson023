package com.aleksandrkunevich.android.andrlesson023.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.R
import kotlinx.android.synthetic.main.item_layout.view.*

class ChatViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {

        // инициализация объъекта ViewHolder из xml R.layout.item_layout
        fun from(parent: ViewGroup): ChatViewHolder {
            return ChatViewHolder(
                LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.item_layout, parent, false)
            )
        }

    }

    private val titleTextView: TextView by lazy { itemView.title }
    private val subtitleTextView: TextView by lazy { itemView.subTitle }
    private val iconImageView: ImageView by lazy { itemView.icon }

    // данные item прописываем в View нашей
    fun bindView(item: Chat) {
        titleTextView.text = item.title
        subtitleTextView.text = item.subtitle
        iconImageView.setImageResource(item.iconId)
    }
}