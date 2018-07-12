package com.swarawan.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var stockAdapter: StockAdapter? = null
    private var linearLayoutManager = LinearLayoutManager(this@MainActivity)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stockAdapter = StockAdapter(mutableListOf())
        recyclerViewStock.apply {
            adapter = stockAdapter
            layoutManager = linearLayoutManager
        }

        setupScrollListener()
        loadData()
    }

    private fun setupScrollListener() {
        recyclerViewStock.addOnScrollListener(object : RecyclerView.OnScrollListener() {

            override fun onScrolled(recyclerView: RecyclerView?, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val visibleItemCount = linearLayoutManager.childCount
                val totalItemCount = linearLayoutManager.itemCount
                val firstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition()

                if (firstVisibleItemPosition + visibleItemCount >= totalItemCount) {
                    loadData()
                }
            }
        })
    }

    fun loadData() {
        stockAdapter?.updateList(Stock.getData())
    }
}
