package com.swarawan.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.StaggeredGridLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var stockAdapter: StockAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stockAdapter = StockAdapter(mutableListOf())
        recyclerViewStock.apply {
            adapter = stockAdapter
            layoutManager = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        }

        stockAdapter?.newList(getData())
    }

    private fun getData(): MutableList<Stock> =
            mutableListOf<Stock>().apply {
                add(Stock(1, "Remote TV", 10, 10000))
                add(Stock(1, "Handphone", 9, 2000000))
                add(Stock(1, "Aqua", 29, 2500))
            }
}
