package com.aleksandrkunevich.android.andrlesson023.recycler

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aleksandrkunevich.android.andrlesson023.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val chatAdapter by lazy { ChatAdapter() }

    private val chatItems: List<Chat> = initChatList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        initRecycler()
    }

    override fun onResume() {
        super.onResume()
        chatAdapter.submitList(chatItems)
    }

    private fun initRecycler() {
        recyclerChat.adapter = chatAdapter
    }

    private fun initChatList(): List<Chat> {
        val list = mutableListOf<Chat>()
        for (i in 0 until 10) {
            list.add(
                Chat(
                    title = "Title $i",
                    subtitle = "Subtitle $i",
                    iconId = R.drawable.ic_launcher_background
                )
            )
        }
        return list
    }
}