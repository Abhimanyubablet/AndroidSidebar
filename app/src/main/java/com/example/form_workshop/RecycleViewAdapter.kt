package com.example.form_workshop

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.bumptech.glide.Glide

class RecycleViewAdapter(val context: Context,val datalist :List<DataModel>,val setOnClick: setOnClick)
    : RecyclerView.Adapter<RecycleViewAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewAdapter.ViewHolder {
        val View = LayoutInflater.from(parent.context).inflate(R.layout.customerlistview,parent,false)
        return ViewHolder(View)
    }

    override fun onBindViewHolder(holder: RecycleViewAdapter.ViewHolder, position: Int) {
       val data=datalist[position]
        holder.description.text=data.description
        holder.title.text=data.title
        Glide.with(context).load(data.image).into(holder.image)
        holder.itemView.setOnClickListener{
            setOnClick.onClick(position)
        }
    }

    override fun getItemCount(): Int {
       return datalist.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val title=itemView.findViewById<TextView>(R.id.title)
        val description=itemView.findViewById<TextView>(R.id.description)
    }
}
interface setOnClick{
    fun onClick(position: Int)
}