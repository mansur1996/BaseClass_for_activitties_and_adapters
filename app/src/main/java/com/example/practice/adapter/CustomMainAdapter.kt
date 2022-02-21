package com.example.practice.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R
import com.example.practice.model.Item

class CustomMainAdapter(var context: Context, var items : ArrayList<Item>) : BaseAdapter(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if(holder is ItemViewHolder){
            holder.apply {
                tvTitle.text = item.title
            }
        }
    }

    override fun getItemCount(): Int  = items.size

    class ItemViewHolder(view : View) :RecyclerView.ViewHolder(view){
        var tvTitle = view.findViewById<TextView>(R.id.tv_item)
    }
}