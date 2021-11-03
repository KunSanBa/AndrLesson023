package com.aleksandrkunevich.android.andrlesson023.recycler

import androidx.annotation.DrawableRes

data class Chat(
    val title: String,
    val subtitle: String,
    @DrawableRes val iconId: Int
)
