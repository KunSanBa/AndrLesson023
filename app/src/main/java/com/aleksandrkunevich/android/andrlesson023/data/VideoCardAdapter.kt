package com.aleksandrkunevich.android.andrlesson023.data

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VideoCardAdapter : RecyclerView.Adapter<VideoCardHolder>() {

    private val videoCardList: MutableList<VideoCard> = mutableListOf()
    private var itemClickListener: ((VideoCard) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoCardHolder {
        val viewHolder = VideoCardHolder.from(parent)

        viewHolder.setItemClickListener { videoCard ->
            itemClickListener?.invoke(videoCard)
        }

        return viewHolder
    }

    override fun onBindViewHolder(holder: VideoCardHolder, position: Int) {
        holder.bindVideoCard(videoCardList[position])
    }

    override fun getItemCount(): Int {
        return videoCardList.size
    }

    fun addVideoCardToList() {
        for (i in 10 until 200 step 10) {
            videoCardList.add(VideoCard(i, "RTX10$i", (500..2000).random()))
        }
        notifyDataSetChanged()
    }

    fun setOnItemClickListener(listener: (VideoCard) -> Unit) {
        itemClickListener = listener
    }
}