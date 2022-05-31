package com.athzaq.apkislamilomba.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.athzaq.apkislamilomba.adapter.AdapterKajian
import com.athzaq.apkislamilomba.databinding.FragmentHomeBinding
import com.athzaq.apkislamilomba.retfrofit.RetrofitBuild
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

private const val linkkajiannabimuhammad = "https://www.youtube.com/watch?v=w6LCQJ3klVg"
private const val linkkajianustsyafiq = "https://www.youtube.com/watch?v=0lGAdoogAnI"

class HomeFragment : Fragment() {

    private lateinit var binding : FragmentHomeBinding
    private val kajianAdapter = AdapterKajian()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)

//        Timber.plant(Timber.DebugTree())
//
//        with(binding){
//            recyclerviewKajian.adapter = kajianAdapter
//            recyclerviewKajian.layoutManager = LinearLayoutManager(context)
//            recyclerviewKajian.setHasFixedSize(true)
//        }
//        val call = RetrofitBuild.getKajianOnline().kajianOnline()
//        //call enqueue untuk mengambil data dari
//        call.enqueue(object  : Callback<ResponseKajian> {
//            override fun onResponse(
//                call: Call<ResponseKajian>,
//                response: Response<ResponseKajian>
//            ) {
//                Timber.d(response.body()?.totalResults.toString())
//                val listArticlesItem = response.body()?.responseKajian
//                listArticlesItem.let {
//                    it?.let { it1 -> kajianAdapter.addDataKajian(it1)}
//                }
//            }
//            override fun onFailure(call: Call<ResponseKajian>, t: Throwable) {
//                // Toast.makeText(this@NewsIndoActivity, "GAGAL! WKWKWKWKWK", Toast.LENGTH_SHORT).show()
//                Timber.e(t.localizedMessage)
//            }
//        })
//
//        binding.cvQuran.setOnClickListener {
//            startActivity(Intent(it.context, QuranActivity::class.java))
//        }
//
         return binding.root
    }
}