package com.aleksandrkunevich.android.andrlesson023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard
import kotlinx.android.synthetic.main.video_card.view.*

class VideoCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    companion object {
        fun from(parent: ViewGroup): VideoCardHolder {
            return VideoCardHolder(
                LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.video_card, parent, false)
            )
        }
    }

    private val tvCard: TextView by lazy { itemView.tvVideocard }
    private var itemClickListener: ((VideoCard) -> Unit)? = null

    fun bindVideoCard(item: VideoCard) {
        tvCard.text = item.vcModel
        itemView.setOnClickListener {
            itemClickListener?.invoke(item)
        }
    }

    fun setItemClickListener(listener: ((VideoCard) -> Unit)) {
        itemClickListener = listener
    }
}