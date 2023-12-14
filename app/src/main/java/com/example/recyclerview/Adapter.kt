package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(private var data :List<User>): //(2)
    RecyclerView.Adapter<Adapter.ViewHolder>() {
    // (1)
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        var nameTextView : TextView = itemView.findViewById(R.id.tv_name)
        val ageTextView : TextView = itemView.findViewById(R.id.tv_age)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Inflation
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.single_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        //(3)
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // (4)
        holder.nameTextView.text = data[position].name
        holder.ageTextView.text= data[position].age.toString()
    }

}