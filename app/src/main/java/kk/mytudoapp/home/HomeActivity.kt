package kk.mytudoapp.home

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import dagger.android.AndroidInjection
import kk.mytudoapp.R
import kk.mytudoapp.home.fragment.HomeFragment
import javax.inject.Inject

class HomeActivity : AppCompatActivity(){

    @Inject
    lateinit var homeAdapter: HomeAdapter

    lateinit var recyclerView: RecyclerView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.home_activity)

        recyclerView = findViewById(R.id.recyclerView)
        homeAdapter.updateList(getList())
        recyclerView.adapter = homeAdapter


        supportFragmentManager.beginTransaction().add(R.id.cPanel, HomeFragment()).commit()
    }


    private fun getList() : List<String> {
        val list = arrayListOf<String>()
        for (i in 1..20) {
            list.add("$i")
        }
        return list
    }
}