package com.aleksandrkunevich.android.andrlesson023

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard

class VideoCardAdapter : RecyclerView.Adapter<VideoCardHolder>() {

    private val videoCardList: MutableList<VideoCard> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoCardHolder {
        return VideoCardHolder.from(parent)
    }

    override fun onBindViewHolder(holder: VideoCardHolder, position: Int) {
        holder.bindVideoCard(videoCardList[position])
    }

    override fun getItemCount(): Int {
        return videoCardList.size
    }

    fun addVideoCardToList(item: VideoCard) {
        videoCardList.add(item)
        notifyDataSetChanged()
    }
}