package com.aleksandrkunevich.android.andrlesson023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard
import com.aleksandrkunevich.android.andrlesson023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val videoCardAdapter: VideoCardAdapter by lazy { VideoCardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initVideoCard()
    }

    fun initVideoCard(){
        for (i in 10 until 100 step 10)
            videoCardAdapter.addVideoCardToList(VideoCard(i, "RTX10$i", (500..2000).random()))
    }
}