package com.athzaq.apkislamilomba

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.athzaq.apkislamilomba.adapter.AdapterKajian
import com.athzaq.apkislamilomba.databinding.ActivityMainBinding
import com.athzaq.apkislamilomba.model.KategoriItem
import com.athzaq.apkislamilomba.retfrofit.RetrofitBuild
import com.athzaq.apkislamilomba.ui.QuranActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    val kajianAdapter = AdapterKajian()

    override fun onCreate(savedInstanceState: Bundle ?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            recyclerviewKajian.adapter = kajianAdapter
            recyclerviewKajian.layoutManager = LinearLayoutManager(this@MainActivity)
            recyclerviewKajian.setHasFixedSize(true)
        }
        val call = RetrofitBuild.getKajianOnline().getDataPuasa()
        //call enqueue untuk mengambil data dari
        call.enqueue(object  : Callback<List<KategoriItem>> {
            override fun onResponse(
                call: Call<List<KategoriItem>>,
                response: Response<List<KategoriItem>>
            ) {
                val listArticlesItem = response.body()!!
                listArticlesItem.let { it.let { it1 -> kajianAdapter.addDataKajian(it1)}
                }
            }
            override fun onFailure(call: Call<List<KategoriItem>>, t: Throwable) {
                 Toast.makeText(this@MainActivity, "GAGAL! WKWKWKWKWK", Toast.LENGTH_SHORT).show()
                Timber.e(t.localizedMessage)
            }
        })

        binding.cvQuran.setOnClickListener {
            startActivity(Intent(it.context, QuranActivity::class.java))
        }



//        //step 1
//        val manageFragment : NavHostFragment = supportFragmentManager
//            .findFragmentById(R.id.fragment_container) as NavHostFragment
//        //step 2
//        val navController = manageFragment.navController
//        //step 3
//        val bottomavigation : BottomNavigationView = findViewById(R.id.bottom_navigation)
//
//        bottomavigation.setupWithNavController(navController)
//
//        drawerLayout = binding.drawerLayout
//        val NavController = this.findNavController(R.id.fragment_container)
//        NavigationUI.setupActionBarWithNavController(this, NavController, drawerLayout)
//        NavController.addOnDestinationChangedListener { controller, destination, _ ->
//            if (destination.id == controller.graph.startDestination){
//                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_UNLOCKED)
//            } else {
//                drawerLayout.setDrawerLockMode(DrawerLayout.LOCK_MODE_LOCKED_CLOSED)
//            }
//        }
//        NavigationUI.setupWithNavController(binding.navView, NavController)
//    }
//    override fun onSupportNavigateUp(): Boolean {
//        val navController = this.findNavController(R.id.fragment_container)
//        return NavigationUI.navigateUp(navController, drawerLayout)
    }
}