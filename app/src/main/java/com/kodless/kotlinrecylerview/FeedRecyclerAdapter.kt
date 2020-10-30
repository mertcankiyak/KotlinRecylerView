package com.kodless.kotlinrecylerview
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedRecyclerAdapter(veriListesi: ArrayList<String>): RecyclerView.Adapter<FeedRecyclerAdapter.PostHolder>() {

    var listem = veriListesi

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.recyler_view_row, parent,false)
        return  PostHolder(view)
    }

    override fun onBindViewHolder(holder: PostHolder, position: Int) {
        holder.setData(listem[position],position)
        holder.textview?.text = listem[position]
        holder.imageView?.setBackgroundResource(R.drawable.ic_launcher_background)
    }

    override fun getItemCount(): Int {
        return  listem.size
    }


    class PostHolder(view: View): RecyclerView.ViewHolder(view){
        //Görünümde kullandığımız elemanları değişkenlerimiz ile birbirine bağladığımız sınıftır.
        var textview :TextView? = null
        var imageView: ImageView?= null

        init {
            textview  = view.findViewById(R.id.tvEmail)
            imageView = view.findViewById(R.id.imageView)

        }

        fun setData(oAnkiVeri:String, position: Int){

            textview?.setOnClickListener {
                val intent = Intent(it.context, MainActivity2::class.java)
                intent.putExtra("veri",oAnkiVeri)
                it.context.startActivity(intent)
            }
        }
    }

}