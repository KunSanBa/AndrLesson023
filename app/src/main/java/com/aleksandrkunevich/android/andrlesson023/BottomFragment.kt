package com.aleksandrkunevich.android.andrlesson023

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.LinearLayout
import androidx.fragment.app.DialogFragment
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.videocard_layout.*

class BottomFragment(private val et_main: EditText) : BottomSheetDialogFragment() {

    private val videoCardAdapter by lazy { VideoCardAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.videocard_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initVideoCard()
        recyclerVideoCard.adapter = videoCardAdapter
        videoCardAdapter.setOnItemClickListener {
            et_main.setText(it.vcModel)
            dismiss()
        }
    }

    private fun initVideoCard() {
        for (i in 10 until 100 step 10)
            videoCardAdapter.addVideoCardToList(VideoCard(i, "RTX10$i", (500..2000).random()))
    }

    override fun getTheme() = R.style.BottomSheetStyleTheme
}