package com.example.yuritzy_lab1_appdepelis.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.yuritzy_lab1_appdepelis.R
import com.example.yuritzy_lab1_appdepelis.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel

    private val binding: FragmentGalleryBinding by lazy {
        DataBindingUtil.inflate<FragmentGalleryBinding>(LayoutInflater.from(activity),
            R.layout.fragment_gallery, null, false)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        galleryViewModel = ViewModelProvider(this).get(GalleryViewModel::class.java)

        val root: View = binding.root

        galleryViewModel.showError.observe(viewLifecycleOwner, Observer {
            binding.editTextPassword.error = "Contraseña invalida"
        })
        return root
    }

}