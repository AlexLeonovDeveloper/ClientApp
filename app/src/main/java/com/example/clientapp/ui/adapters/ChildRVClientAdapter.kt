package com.example.clientapp.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.clientapp.R
import com.example.clientapp.databinding.ItemChildExpanBinding
import com.example.clientapp.models.ClientService


class ChildRVClientAdapter(private val children: MutableList<ClientService>)
    : RecyclerView.Adapter<ChildRVClientAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemChildExpanBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(val binding: ItemChildExpanBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(appGarbage: ClientService) {
            val context = binding.root.context
            binding.apply {
                tvTitle.text = appGarbage.title
                if (appGarbage.image == null) {
                    Glide.with(context).load(context.getDrawable((R.drawable.iv_child))).into(ivImage)
                } else {
                    Glide.with(context).load(appGarbage.image).into(ivImage)
                }
                tvMoney.text = appGarbage.money
                cbDeleteIntentions.setOnCheckedChangeListener { _, isChecked ->
                }
            }
        }
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val child = children[position]
        holder.bind(child)
    }
    override fun getItemCount(): Int {
        return children.size
    }
}