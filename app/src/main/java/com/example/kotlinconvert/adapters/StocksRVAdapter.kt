package com.example.kotlinconvert.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinconvert.databinding.StocksRvListBinding
import com.example.kotlinconvert.models.DataX

class StocksRVAdapter(var stocksModelArrayList: ArrayList<DataX>, val context: Context) :
    RecyclerView.Adapter<StocksRVAdapter.ViewHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StocksRVAdapter.ViewHolder {
        val stocksRvListBinding: StocksRvListBinding =
            StocksRvListBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(stocksRvListBinding, stocksRvListBinding.root)
    }

    override fun onBindViewHolder(holder: StocksRVAdapter.ViewHolder, position: Int) {
        val stocksModel = stocksModelArrayList[position].stockData
        holder.binding.tvStocksName.text = stocksModel.stockName
        holder.binding.tv1DayValue.text = "${stocksModel.dayChangeP.toString()}%"
        holder.binding.tv1YearValue.text = stocksModel.yearChangeP.toString() + "%"
        holder.binding.tvCurrentPriceValue.text = stocksModel.currentPrice.toString()
        holder.binding.tvSectorName.text = stocksModel.sectorName
        holder.binding.tvCircleStocksName.text = stocksModel.stockName.substring(0, 1)
    }

    override fun getItemCount(): Int {
        return stocksModelArrayList.size
    }

    inner class ViewHolder(stocksRvListBinding: StocksRvListBinding, itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding: StocksRvListBinding

        init {
            binding = stocksRvListBinding
        }
    }
}