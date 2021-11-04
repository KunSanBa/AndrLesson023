package com.aleksandrkunevich.android.andrlesson023

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard
import com.aleksandrkunevich.android.andrlesson023.databinding.VideocardLayoutBinding

class VideoCardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding = VideocardLayoutBinding.bind(itemView)

    companion object {
        fun from(parent: ViewGroup): VideoCardHolder {
            return VideoCardHolder(
                LayoutInflater
                    .from(parent.context)
                    .inflate(R.layout.videocard_layout, parent, false)
            )
        }
    }

    fun bindVideoCard(item: VideoCard){
        binding.etVideoCardLayout1.setText(item.vcModel)
    }
}