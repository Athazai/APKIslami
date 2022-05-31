package com.athzaq.apkislamilomba.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Entity(tableName = "item")
@Parcelize
data class ResponseKategori(

	@field:SerializedName("Kategori")
	val kategori: List<KategoriItem?>? = null
) : Parcelable

@Parcelize
data class KategoriItem(

	@field:SerializedName("data")
	val data: List<DataItem>? = null,

	@field:SerializedName("title")
	val title: String? = null,

	@field:SerializedName("gambar")
	val gambar: String? = null
) : Parcelable

@Parcelize
data class DataItem(

	@PrimaryKey(autoGenerate = true)
	val id: Int? = 0,

	@field:SerializedName("artihadist")
	val artihadist: String? = null,

	@field:SerializedName("judulhadist")
	val judulhadist: String? = null,

	@field:SerializedName("riwayathadist")
	val riwayathadist: String? = null,

	@field:SerializedName("hukumpuasa")
	val hukumpuasa: String? = null,

	@field:SerializedName("keutamaanpuasa")
	val keutamaanpuasa: String? = null,

	@field:SerializedName("namapuasa")
	val namapuasa: String? = null,

) : Parcelable
