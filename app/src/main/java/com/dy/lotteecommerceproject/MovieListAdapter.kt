package com.dy.lotteecommerceproject

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dy.lotteecommerceproject.databinding.HolderMovieBinding
import com.dy.lotteecommerceproject.model.SearchResult
import java.text.SimpleDateFormat
import java.util.*

class MovieListAdapter() :
        ListAdapter<SearchResult, MovieListAdapter.ViewHolder>(diffUtil) {

    inner class ViewHolder(private val binding: HolderMovieBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(item: SearchResult) {
                binding.item = item
            }
        }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = HolderMovieBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    object CommonBindingAdapters{
        @BindingAdapter("app:imageUrl", "app:placeholder")
        @JvmStatic fun loadImage(imageView: ImageView, url: String, placeholder: Drawable){
            val img = url.split("|")[0]
            Glide.with(imageView.context)
                .load(img)
                .placeholder(placeholder)
                .error(placeholder)
                .apply(RequestOptions().fitCenter())
                .into(imageView)
        }

        @BindingAdapter("app:setDate")
        @JvmStatic fun text(textView: TextView, date: String){
            if(date == ""){
                textView.text = "-"
            } else {
                val dateFormat = SimpleDateFormat("yyyyMMdd")
                val temp: Date = dateFormat.parse(date)
                textView.text = SimpleDateFormat("yyyy-MM-dd").format(temp)
            }
        }

    }

    companion object {
        val diffUtil = object : DiffUtil.ItemCallback<SearchResult>() {

            override fun areItemsTheSame(oldItem: SearchResult, newItem: SearchResult) =
                oldItem.movieSeq == newItem.movieSeq

            override fun areContentsTheSame(oldItem: SearchResult, newItem: SearchResult) =
                oldItem == newItem
        }
    }

}
