package com.example.clientapp.ui.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clientapp.R
import com.example.clientapp.models.TopMain

class TopMainAdapter (val requireContext: Context, val listmain: ArrayList<TopMain>) : RecyclerView.Adapter<TopMainAdapter.animalViewHolder>() {

    inner class animalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageview = itemView.findViewById<ImageView>(R.id.iv_animal)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): animalViewHolder {
        return animalViewHolder(
            LayoutInflater.from(requireContext).inflate(R.layout.item_top_main, parent, false)
        )
    }
    override fun onBindViewHolder(holder: animalViewHolder, position: Int) {
        Glide.with(requireContext).load(listmain[position].link).into(holder.imageview)
    }
    override fun getItemCount() = listmain.size
}