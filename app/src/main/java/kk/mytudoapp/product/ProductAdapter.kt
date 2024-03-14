package kk.mytudoapp.product

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import kk.mytudoapp.R
import javax.inject.Inject

class ProductAdapter @Inject constructor(private var list: List<String>) :
    RecyclerView.Adapter<ProductAdapter.MyHomeHolder>() {

        fun updateList(_list: List<String>){
            list = _list
            notifyDataSetChanged()
        }

    inner class MyHomeHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTxt = view.findViewById<AppCompatTextView>(R.id.row_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHomeHolder {
        return MyHomeHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyHomeHolder, position: Int) {
        holder.nameTxt.text = list[position]
    }
}


