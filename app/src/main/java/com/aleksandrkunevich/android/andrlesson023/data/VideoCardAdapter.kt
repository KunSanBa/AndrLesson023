package com.aleksandrkunevich.android.andrlesson023.data

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class VideoCardAdapter : RecyclerView.Adapter<VideoCardHolder>() {

    private val videoCardList = DataSource.dataList
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

    fun setOnItemClickListener(listener: (VideoCard) -> Unit) {
        itemClickListener = listener
    }
}