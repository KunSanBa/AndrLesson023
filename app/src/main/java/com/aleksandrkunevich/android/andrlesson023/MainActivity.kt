package com.aleksandrkunevich.android.andrlesson023

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.aleksandrkunevich.android.andrlesson023.data.Card
import com.aleksandrkunevich.android.andrlesson023.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private val cardAdapter: CardAdapter by lazy { CardAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerCard.adapter = cardAdapter

        Log.d("!!!!", "5")

        for (i in 0 until 10)
            cardAdapter.addCard(Card(i, "model $i", (0..1000).random()))
    }
}