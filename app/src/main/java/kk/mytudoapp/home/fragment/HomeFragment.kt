package kk.mytudoapp.home.fragment

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import kk.mytudoapp.R
import kk.mytudoapp.home.HomeAdapter
import javax.inject.Inject


class HomeFragment : Fragment() {

    @Inject
    lateinit var homeAdapter: HomeAdapter

    lateinit var recyclerView: RecyclerView


    override fun onAttach(context: Context) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.recyclerview_fragment)
        homeAdapter.updateList(getList())
        recyclerView.adapter = homeAdapter
    }


    private fun getList() : List<String> {
        val list = arrayListOf<String>()
        for (i in 10..40) {
            list.add("$i")
        }
        return list
    }

}