package com.athzaq.apkislamilomba.retfrofit

import com.athzaq.apkislamilomba.model.KategoriItem
import com.athzaq.apkislamilomba.model.ResponseKategori
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

object RetrofitBuild {

    private val client : OkHttpClient = OkHttpClient.Builder().build()

    private val retrofit : Retrofit = Retrofit.Builder()
        .baseUrl("https://portofolio-diri-default-rtdb.asia-southeast1.firebasedatabase.app/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()

    fun getKajianOnline() = retrofit.create(Kajian::class.java)

    interface Kajian {
        @GET("Kategori.json")

        fun getDataPuasa() : Call<List<KategoriItem>>
    }

}