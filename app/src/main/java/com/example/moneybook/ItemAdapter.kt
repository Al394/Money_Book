package com.example.moneybook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_element.view.*

class ItemAdapter(private val itemList: List<ItemCardData>):RecyclerView.Adapter<ItemAdapter.ItemHolder>() {
    class ItemHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val barretta: ImageView = itemView.barretta
        val tipo: TextView = itemView.tipo
        val descrizione: TextView = itemView.descrizione
        val saldo: TextView = itemView.saldo
        val more: ImageView = itemView.more


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_element,parent,false)

        return ItemHolder(itemView)
    }

    override fun getItemCount() = itemList.size

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val currentItem = itemList[position]

        holder.barretta.setImageResource(currentItem.barretta)
        holder.tipo.text =currentItem.tipo
        holder.descrizione.text =currentItem.descrizione
        holder.saldo.text =currentItem.saldo
        holder.more.setImageResource(currentItem.menu)

    }
}