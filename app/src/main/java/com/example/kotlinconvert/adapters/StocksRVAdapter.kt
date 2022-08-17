package com.example.kotlinconvert.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinconvert.databinding.StocksRvListBinding
import com.example.kotlinconvert.models.StockModel

class StocksRVAdapter(var stocksModelArrayList: ArrayList<StockModel>?, val context: Context) :
    RecyclerView.Adapter<StocksRVAdapter.ViewHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StocksRVAdapter.ViewHolder {
        val stocksRvListBinding: StocksRvListBinding =
            StocksRvListBinding.inflate(LayoutInflater.from(context), parent, false)
        return ViewHolder(stocksRvListBinding, stocksRvListBinding.root)
    }

    override fun onBindViewHolder(holder: StocksRVAdapter.ViewHolder, position: Int) {
//        val StockModel = stocksModelArrayList?.get(position).data[position].stockData.stock_id
//        holder.binding.tvStocksName.text = stocksModel.data[position].stockData.stockName
//        holder.binding.tv1DayValue.text = stocksModel.data[position].stockData.stockName
//        holder.binding.tv1YearValue.text = stocksModel.data[position].stockData.stockName
//        holder.binding.tvCurrentPriceValue.text = stocksModel.data[position].stockData.stockName
//        holder.binding.tvSectorName.text = stocksModel.data[position].stockData.stockName
        //        holder.circleStockNameInitial.setText(stocksModel.getStockName().substring(0,1));
    }

    override fun getItemCount(): Int {
        return stocksModelArrayList?.size ?: 0
    }

    inner class ViewHolder(stocksRvListBinding: StocksRvListBinding, itemView: View) :
        RecyclerView.ViewHolder(itemView) {
        val binding: StocksRvListBinding
        init {
            binding = stocksRvListBinding
        }
    }
}