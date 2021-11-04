package com.aleksandrkunevich.android.andrlesson023.recycler

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.aleksandrkunevich.android.andrlesson023.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_layout.*

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

        recyclerChat.setOnClickListener {
        }

        recyclerChat.setOnLognClickListener1 {
        }

        chatAdapter.setOnItemClickListener { chat ->
//            subTitle.text = chat.title
//            editText.text = chat.someText
            android.widget.Toast.makeText(this, "Hello", android.widget.Toast.LENGTH_SHORT)
        }
    }

    // Экстеншион функция - расширяем View через лямбда
    fun View.setOnLognClickListener1(listner: () -> (Unit)) {
        listner.invoke()  // .invoke() - оператор вызова функции, в данном случаем listner
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