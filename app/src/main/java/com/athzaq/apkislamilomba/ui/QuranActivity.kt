package com.athzaq.apkislamilomba.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.athzaq.apkislamilomba.R
import com.athzaq.apkislamilomba.adapter.ItemAdapter
import com.athzaq.apkislamilomba.adapter.QuranAdapter
import com.athzaq.apkislamilomba.databinding.ActivityQuranBinding
import com.athzaq.apkislamilomba.model.KategoriItem
import com.batoulapps.adhan.data.DateComponents

class QuranActivity : AppCompatActivity() {

    private lateinit var binding : ActivityQuranBinding

    companion object{
        const val IKAN = "IKAN"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuranBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}