package com.swarawan.sample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

/**
 * Created by Rio Swarawn on 7/10/18.
 */
class StockAdapter(private val stocks: MutableList<Stock>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_stock, parent, false)
        return StockViewHolder(v)
    }

    override fun getItemCount(): Int = stocks.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val viewHolder = holder as StockViewHolder
        viewHolder.bind(stocks[position])
    }

    fun newList(list: MutableList<Stock>) {
        stocks.clear()
        stocks.addAll(list)
        notifyDataSetChanged()
    }

    fun updateList(list: MutableList<Stock>) {
        stocks.addAll(list)
        notifyDataSetChanged()
    }
}