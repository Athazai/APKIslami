package com.athzaq.apkislamilomba.adapter

import android.annotation.SuppressLint
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.athzaq.apkislamilomba.databinding.ItemRecyclerhomekajianBinding
import com.athzaq.apkislamilomba.model.KategoriItem
import com.athzaq.apkislamilomba.ui.ListActivity

class AdapterKajian : RecyclerView.Adapter<AdapterKajian.ViewHolder>() {

    private val listkajian : ArrayList<KategoriItem> = arrayListOf()

    @SuppressLint("NotifyDataSetChanged")
    fun addDataKajian(getData: List<KategoriItem>){
        listkajian.clear()
        listkajian.addAll(getData)
        notifyDataSetChanged()
    }

    class ViewHolder(var binding: ItemRecyclerhomekajianBinding) : RecyclerView.ViewHolder(binding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemRecyclerhomekajianBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val datakajian = listkajian[position]

        holder.binding.txtJudulkajian.text = datakajian.title
        holder.binding.imgKajian.load(datakajian.gambar!!){
            scale(Scale.FILL)
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context,ListActivity::class.java)
            intent.putExtra(ListActivity.DATA, datakajian)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = listkajian.size



}