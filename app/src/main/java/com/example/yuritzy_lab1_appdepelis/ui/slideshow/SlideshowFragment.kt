package com.example.yuritzy_lab1_appdepelis.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.yuritzy_lab1_appdepelis.R
import com.example.yuritzy_lab1_appdepelis.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    private lateinit var slideshowViewModel: SlideshowViewModel

    private val binding: FragmentSlideshowBinding by lazy {
        DataBindingUtil.inflate<FragmentSlideshowBinding>(LayoutInflater.from(activity),
            R.layout.fragment_slideshow, null, false)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        slideshowViewModel = ViewModelProvider(this).get(SlideshowViewModel::class.java)

        val root: View = binding.root

        val textView: TextView = binding.textSlideshow

        slideshowViewModel.text.observe(viewLifecycleOwner) { textView.text = it }

        return root
    }

}