package com.athzaq.apkislamilomba.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.athzaq.apkislamilomba.databinding.ItemRecyclerhudBinding
import com.athzaq.apkislamilomba.databinding.ItemRecyclerpuasaBinding
import com.athzaq.apkislamilomba.model.DataItem

class QuranAdapter(private val listHud : List<DataItem>) : RecyclerView.Adapter<QuranAdapter.ViewHolder>() {
    class ViewHolder(var binding: ItemRecyclerhudBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerhudBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataItem = listHud[position]

        holder.binding.txtSurahhud.text = dataItem.namapuasa
        holder.binding.txtBismillah.text = dataItem.keutamaanpuasa

    }

    override fun getItemCount() = listHud.size
}