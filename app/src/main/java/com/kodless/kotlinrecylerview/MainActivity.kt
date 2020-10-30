package com.kodless.kotlinrecylerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var veriListem = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        veriListem.add("Mertcan")
        veriListem.add("Hasan")
        veriListem.add("Veli")
        veriListem.add("Mustafa")

        var layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager

        val adapter = FeedRecyclerAdapter(veriListem)
        recyclerView.adapter = adapter

        recyclerView.setOnClickListener {
            Toast.makeText(applicationContext,"tıklandı", Toast.LENGTH_LONG).show()
        }

    }
}