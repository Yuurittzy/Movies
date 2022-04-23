package com.example.yuritzy_lab1_appdepelis.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.yuritzy_lab1_appdepelis.MoviesData
import com.example.yuritzy_lab1_appdepelis.R

class MoviesAdapter(private val moviesList: List<MoviesData>) : RecyclerView.Adapter<MoviesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        return MoviesViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_movie, parent, false))
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        holder.render(moviesList[position])
    }

    override fun getItemCount(): Int = moviesList.size

}