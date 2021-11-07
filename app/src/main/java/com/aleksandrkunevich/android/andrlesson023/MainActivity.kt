package com.aleksandrkunevich.android.andrlesson023

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        runClick()
    }

    private fun runClick() {

        et_main_1.setOnClickListener {
            BottomFragment.newInstance { videocard ->
                et_main_1.setText(videocard.vcModel)
            }.show(supportFragmentManager, BottomFragment.TAG)
        }
        et_main_2.setOnClickListener {
            BottomFragment.newInstance { videocard ->
                et_main_2.setText(videocard.vcModel)
            }.show(supportFragmentManager, BottomFragment.TAG)
        }
        et_main_3.setOnClickListener {
            BottomFragment.newInstance { videocard ->
                et_main_3.setText(videocard.vcModel)
            }.show(supportFragmentManager, BottomFragment.TAG)
        }
        et_main_4.setOnClickListener {
            BottomFragment.newInstance { videocard ->
                et_main_4.setText(videocard.vcModel)
            }.show(supportFragmentManager, BottomFragment.TAG)
        }
        et_main_5.setOnClickListener {
            BottomFragment.newInstance { videocard ->
                et_main_5.setText(videocard.vcModel)
            }.show(supportFragmentManager, BottomFragment.TAG)
        }
    }
}