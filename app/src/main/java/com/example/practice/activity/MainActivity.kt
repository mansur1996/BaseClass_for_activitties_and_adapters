package com.example.practice.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.*
import com.example.practice.R
import com.example.practice.adapter.CustomMainAdapter
import com.example.practice.model.Item

class MainActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        val items = preparedItemList()
        refreshAdapter(items)
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rv_main)
        recyclerView.layoutManager = GridLayoutManager(this, 2)

        val openBtn = findViewById<Button>(R.id.btn_open)

        openBtn.setOnClickListener { openDetailsPage() }
    }

    private fun refreshAdapter(items: ArrayList<Item>){
        recyclerView.adapter = CustomMainAdapter(this, items)
    }

    private fun openDetailsPage(){
        startActivity(Intent(this, DetailActivity::class.java))
    }
}