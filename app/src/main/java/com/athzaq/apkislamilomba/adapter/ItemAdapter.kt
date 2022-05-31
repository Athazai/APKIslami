package com.athzaq.apkislamilomba.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.athzaq.apkislamilomba.databinding.ItemRecyclerpuasaBinding
import com.athzaq.apkislamilomba.model.DataItem
import com.athzaq.apkislamilomba.model.KategoriItem


class ItemAdapter(private val listItem : List<DataItem>) : RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(var binding: ItemRecyclerpuasaBinding) : RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerpuasaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val dataItem = listItem[position]

        holder.binding.txtJudulpuasa.text = dataItem.namapuasa
        holder.binding.txtKeutamaanpuasa.text = dataItem.keutamaanpuasa
        holder.binding.txtHukumpuasa.text = dataItem.hukumpuasa

    }

    override fun getItemCount() = listItem.size
}