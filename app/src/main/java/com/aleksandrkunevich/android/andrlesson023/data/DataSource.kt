package com.aleksandrkunevich.android.andrlesson023.data

object DataSource {

    private val data: MutableList<VideoCard> = mutableListOf()
    val dataList: List<VideoCard> = createData()

    private fun createData(): List<VideoCard> {

        for (i in 10 until 200 step 10) {
            data.add(VideoCard(i, "RTX10$i", (500..2000).random()))
        }
        return data.toList()
    }
}
