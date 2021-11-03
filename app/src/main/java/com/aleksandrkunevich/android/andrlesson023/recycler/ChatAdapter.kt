package com.aleksandrkunevich.android.andrlesson023.recycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ChatAdapter : RecyclerView.Adapter<ChatViewHolder>() {

    private var items: List<Chat> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        return ChatViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bindView(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(data: List<Chat>) {
        items = data
        notifyDataSetChanged() // перересовываем данные (список) выводимые на эксран
    }
}