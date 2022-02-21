package com.example.practice.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practice.R
import com.example.practice.adapter.CustomDetailAdapter
import com.example.practice.adapter.CustomMainAdapter
import com.example.practice.model.Item

class DetailActivity : BaseActivity() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        initViews()

        val items = preparedItemList()
        refreshAdapter(items)
    }

    private fun initViews(){
        recyclerView = findViewById(R.id.rv_detail)
        recyclerView.layoutManager = GridLayoutManager(this, 1)
    }

    private fun refreshAdapter(items: ArrayList<Item>){
        recyclerView.adapter = CustomDetailAdapter(this, items)
    }
}