package com.example.recyclerapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@Suppress("DEPRECATION")
class ListFoodAdapter(private val listFood:ArrayList<Foods>):RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    inner class ListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        var imgPhoto:ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName:TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail:TextView = itemView.findViewById(R.id.tv_detail)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view : View = LayoutInflater.from(parent.context).inflate(R.layout.item_list_food,parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55,55))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.itemView.setOnClickListener {
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Foods)
    }

}