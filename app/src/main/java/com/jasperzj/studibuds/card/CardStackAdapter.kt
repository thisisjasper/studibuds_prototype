package com.jasperzj.studibuds.card

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.jasperzj.studibuds.R

class CardStackAdapter(private var carddatas: List<CardData> = emptyList()) : RecyclerView.Adapter<CardStackAdapter.ViewHolder>() {
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nicknameView: TextView = view.findViewById(R.id.item_nickname)
        val discordTagView: TextView = view.findViewById(R.id.item_discordTag)
        val descriptionView: TextView = view.findViewById(R.id.item_description)
        val image: ImageView = view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflator = LayoutInflater.from(parent.context)
        return ViewHolder(inflator.inflate(R.layout.person_card, parent, false))
    }

    override fun getItemCount(): Int {
        return carddatas.size
    }

    fun getCardDatas(): List<CardData> {
        return carddatas
    }

    fun setCardDatas(carddatas: List<CardData>) {
        this.carddatas = carddatas
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val curr_cd = carddatas[position]
        holder.nicknameView.text = "${curr_cd.id}. ${curr_cd.nickname}"
        holder.discordTagView.text = "${curr_cd.handle}"
        holder.descriptionView.text = "${curr_cd.description}"
        Glide.with(holder.image)
            .load(curr_cd.url)
            .into(holder.image)
        holder.itemView.setOnClickListener { v ->
            Toast.makeText(v.context, curr_cd.nickname, Toast.LENGTH_SHORT).show()
        }
    }
}