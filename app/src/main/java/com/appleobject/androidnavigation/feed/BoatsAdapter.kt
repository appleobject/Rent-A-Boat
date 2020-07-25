package com.appleobject.androidnavigation.feed

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.appleobject.androidnavigation.R

class BoatsAdapter(private val boats: List<Boat>, private val onBoatClick: (Int)-> Unit) : RecyclerView.Adapter<BoatsViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoatsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_boat, parent, false)
        return BoatsViewHolder(view)
    }

    override fun getItemCount() = boats.size

    override fun onBindViewHolder(holder: BoatsViewHolder, position: Int) {
        holder.bind(boats[position], onBoatClick)
    }

}