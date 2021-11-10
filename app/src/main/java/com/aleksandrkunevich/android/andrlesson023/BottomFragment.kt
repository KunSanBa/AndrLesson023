package com.aleksandrkunevich.android.andrlesson023

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.aleksandrkunevich.android.andrlesson023.data.VideoCard
import com.aleksandrkunevich.android.andrlesson023.data.VideoCardAdapter
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.videocard_layout.*

class BottomFragment(private val listener: (VideoCard) -> Unit) : BottomSheetDialogFragment() {

    companion object {
        const val TAG = "BottomFragment"
        fun newInstance(listener: ((VideoCard) -> Unit)): BottomFragment {
            return BottomFragment(listener)
        }
    }

    private val videoCardAdapter by lazy { VideoCardAdapter() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
//        BottomSheetBehavior.from().peekHeight = 300
        return inflater.inflate(R.layout.videocard_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        videoCardAdapter.notifyDataSetChanged()
        recyclerVideoCard.adapter = videoCardAdapter
        videoCardAdapter.setOnItemClickListener { videocard ->
            listener.invoke(videocard)
            dismiss()
        }
    }
}