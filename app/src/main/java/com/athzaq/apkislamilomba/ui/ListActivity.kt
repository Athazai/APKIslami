package com.athzaq.apkislamilomba.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.athzaq.apkislamilomba.R
import com.athzaq.apkislamilomba.adapter.AdapterKajian
import com.athzaq.apkislamilomba.adapter.ItemAdapter
import com.athzaq.apkislamilomba.databinding.ActivityListBinding
import com.athzaq.apkislamilomba.databinding.ActivityMainBinding
import com.athzaq.apkislamilomba.model.KategoriItem
import com.athzaq.apkislamilomba.retfrofit.RetrofitBuild
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class ListActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListBinding

    companion object {
        const val DATA = "DATA"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.imgBackpuasa.setOnClickListener {
            startActivity(Intent(this, ActivityMainBinding::class.java))
        }

        val dataItem = intent.getParcelableExtra<KategoriItem>(DATA)

        binding.recyclerPuasa.apply {
            adapter = dataItem?.data?.let { ItemAdapter(it) }
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@ListActivity)
        }

//        val call = RetrofitBuild.getKajianOnline().puasaOnline()
//        //call enqueue untuk mengambil data dari
//        call.enqueue(object  : Callback<KategoriItem> {
//            override fun onResponse(
//                call: Call<KategoriItem>,
//                response: Response<KategoriItem>
//            ) {
//                val listArticlesItem = response.body()?.data
//                listArticlesItem.let { it?.let { it1 -> adapterbinding.addDataItem(it1)}
//                }
//            }
//            override fun onFailure(call: Call<KategoriItem>, t: Throwable) {
//                Toast.makeText(this@ListActivity, "GAGAL! WKWKWKWKWK", Toast.LENGTH_SHORT).show()
//                Timber.e(t.localizedMessage)
//            }
//        })
    }
}