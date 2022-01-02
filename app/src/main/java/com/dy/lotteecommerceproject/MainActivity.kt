package com.dy.lotteecommerceproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.GridLayoutManager
import com.dy.lotteecommerceproject.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var movieAdapter: MovieListAdapter
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.apply {
            lifecycleOwner = this@MainActivity
            viewmodel = mainViewModel

            movieAdapter = MovieListAdapter()
            recyclerView.apply {
                layoutManager = GridLayoutManager(this@MainActivity,2)
                adapter = movieAdapter

            }

            mainViewModel.movieInfo.observe(this@MainActivity,{
                movieAdapter.submitList(it[0].result)
            })

        }
    }




}