package ru.mirea.laba

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {

    private val adapter = ItemsRecyclerViewAdapter(ArrayList())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView(itemsList())
    }

    private fun setupRecyclerView(items: List<Int>) {
        rv_main.layoutManager = LinearLayoutManager(this)
        rv_main.adapter = adapter
        adapter.addItems(items)
        btn_add_item.setOnClickListener { adapter.incrementItem() }
    }

    private fun itemsList(): List<Int> {
        val items = mutableListOf<Int>()
        for (i in 0 until intent.getIntExtra("itemsCount", 0)) items.add(i)
        return items
    }

}