package com.swarawan.sample

import android.support.v7.widget.RecyclerView
import android.view.View
import kotlinx.android.synthetic.main.item_stock.view.*

/**
 * Created by Rio Swarawn on 7/10/18.
 */
class StockViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    fun bind(item: Stock) {
        itemView.textName.text = item.name
        itemView.textPrice.text = "Rp ${item.price}"
        itemView.textStock.text = "In Stock: ${item.stock}"
    }
}