package com.example.yuritzy_lab1_appdepelis.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.yuritzy_lab1_appdepelis.MoviesData
import com.example.yuritzy_lab1_appdepelis.R
import com.example.yuritzy_lab1_appdepelis.adapter.MoviesAdapter
import com.example.yuritzy_lab1_appdepelis.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel

    private val binding: FragmentHomeBinding by lazy {
        DataBindingUtil.inflate<FragmentHomeBinding>(LayoutInflater.from(activity),
            R.layout.fragment_home, null, false)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        homeViewModel = ViewModelProvider(this).get(HomeViewModel::class.java)
        val root: View = binding.root

        initRecyclerView()
        return root
    }

    private fun initRecyclerView(){
        val movieList = listOf(
            MoviesData("Turning Red","Infantil", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.red)!!),
            MoviesData("Hola, Alberto","Infantil", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.alberto)!!),
            MoviesData("El diario de Greg","Infantil", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.greg)!!),
            MoviesData("BELLE","Cine romántico", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.belle)!!),
            MoviesData("Si algo me pasa","Cortometraje", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.sialgomepasa)!!),
            MoviesData("El amor en su lugar","Romance", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.amorensulugar)!!),
            MoviesData("El secreto de Vicky","Infantil", ContextCompat.getDrawable(activity?:requireContext(), R.drawable.vicky)!!)
        )

        val recyclerView = binding.RecyclerMovies
        recyclerView.layoutManager = LinearLayoutManager(activity)
        recyclerView.adapter = MoviesAdapter(movieList)
    }

}