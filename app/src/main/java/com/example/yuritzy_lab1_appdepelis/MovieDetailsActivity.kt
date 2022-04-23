package com.example.yuritzy_lab1_appdepelis

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.yuritzy_lab1_appdepelis.databinding.ActivityMovieDetailBinding

class MovieDetailsActivity: AppCompatActivity() {

    private val binding : ActivityMovieDetailBinding by lazy {
        DataBindingUtil.setContentView<ActivityMovieDetailBinding>(this, R.layout.activity_movie_detail)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        intent.extras?.let {
            val name = it.getString("name")
            binding.tvName.text = name
            binding.tvGenre.text = it.getString("genre")

            getVideo(name)
        }
    }

    private fun getVideo(name: String?) {
        val video = when(name) {
            "Turning Red" -> R.raw.t_red
            "Hola, Alberto" -> R.raw.t_alberto
            "El diario de Greg" -> R.raw.t_greg
            "BELLE" -> R.raw.t_belle
            "Si algo me pasa" -> R.raw.t_sialgomepasa
            "El amor en su lugar" -> R.raw.t_elamor
            "El secreto de Vicky" -> R.raw.t_vicky

            else -> R.raw.t_alberto
        }

        binding.videoView.setVideoURI(Uri.parse("android.resource://$packageName/$video"))
        binding.videoView.start()
    }

}