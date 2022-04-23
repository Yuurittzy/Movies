package com.example.yuritzy_lab1_appdepelis.adapter

import android.content.Intent
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.yuritzy_lab1_appdepelis.MovieDetailsActivity
import com.example.yuritzy_lab1_appdepelis.MoviesData
import com.example.yuritzy_lab1_appdepelis.R

class MoviesViewHolder(private val view:View) : RecyclerView.ViewHolder(view) {

    private val photo = view.findViewById<ImageView>(R.id.iv_photo)
    private val name = view.findViewById<TextView>(R.id.tv_name)
    private val genre = view.findViewById<TextView>(R.id.tv_genre)

    fun render (movieModel: MoviesData) {
        name.text = movieModel.name
        genre.text = movieModel.genre
        photo.setImageDrawable(movieModel.photo)

        val intent = Intent(view.context, MovieDetailsActivity::class.java)
        intent.putExtra("name", movieModel.name)
        intent.putExtra("genre", movieModel.genre)

        itemView.setOnClickListener{ view.context.startActivity(intent)  }
    }

}