package com.aleksandrkunevich.android.andrlesson023.recycler

import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.R
import kotlinx.android.synthetic.main.item_layout.view.*

class ChatAdapter : RecyclerView.Adapter<ChatViewHolder>() {

    private var items: List<Chat> = mutableListOf()
    private var itemClickListener: ((Chat) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChatViewHolder {
        val viewHolder = ChatViewHolder.from(parent)
        viewHolder.setItemClickListener {  chat ->
            itemClickListener?.invoke(chat)
        }
        return viewHolder
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

    fun setOnItemClickListener(listener: ((Chat) -> Unit)) {
        itemClickListener = listener
    }
}