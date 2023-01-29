package com.example.recyclerapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

@Suppress("DEPRECATION")
class CardFoodAdapter(private val listFood:ArrayList<Foods>): RecyclerView.Adapter<CardFoodAdapter.CardViewHolder>() {
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    inner class CardViewHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_view_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var btnFavorite: Button = itemView.findViewById(R.id.button_favorite)
        var btnShare: Button = itemView.findViewById(R.id.button_share)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.item_card_food,parent,false)
        return CardViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail
        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
            Toast.makeText(holder.itemView.context,"You Chose "+listFood[holder.adapterPosition].name,Toast.LENGTH_SHORT).show()
        }
        holder.btnFavorite.setOnClickListener {
            Toast.makeText(holder.itemView.context,"Favorite "+listFood[holder.adapterPosition].name,Toast.LENGTH_SHORT).show()
        }
        holder.btnShare.setOnClickListener {
            Toast.makeText(holder.itemView.context,"Share "+listFood[holder.adapterPosition].name,Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }
    interface OnItemClickCallback {
        fun onItemClicked(data: Foods)
    }
}