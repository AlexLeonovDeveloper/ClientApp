package com.example.clientapp.ui.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isGone
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.clientapp.databinding.ItemParentExpandableBinding
import com.example.clientapp.models.TopicClientService

class ParentRVClientAdapter(private val parents: List<TopicClientService>) :
    RecyclerView.Adapter<ParentRVClientAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemParentExpandableBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }
    inner class ViewHolder(val binding: ItemParentExpandableBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(topicAndAppGarbageList: TopicClientService, position: Int) {
            binding.apply {

                tvchap.text = topicAndAppGarbageList.title
                val adapterClass = ChildRVClientAdapter(topicAndAppGarbageList.listAppGarbage)
                childRecycler.apply {
                    layoutManager = LinearLayoutManager(context)
                    adapter = adapterClass
                }
                ivCleanClose.setOnClickListener {
                    childRecycler.isGone = !childRecycler.isGone
                }
                rvCard.setOnClickListener {
                    childRecycler.isGone = !childRecycler.isGone
                }
                    adapterClass.notifyDataSetChanged()
            }
        }
    }
    @SuppressLint("WrongConstant")
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val parent = parents[position]
        holder.bind(parent, position)
    }
    override fun getItemCount(): Int {
        return parents.size
    }
}