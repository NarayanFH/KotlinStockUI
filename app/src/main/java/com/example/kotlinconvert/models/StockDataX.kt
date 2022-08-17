package com.example.kotlinconvert.models

data class StockDataX(
    val BSEcode: String,
    val ExchangeForPrice: String,
    val ISIN: String,
    val NSEcode: String,
    val currentPrice: Double,
    val dayChange: Double,
    val dayChangeP: Double,
    val industryName: String,
    val monthChange: Double,
    val monthChangeP: Double,
    val pageType: String,
    val sectorName: String,
    val stockName: String,
    val stock_id: Int,
    val updated: String,
    val weekChange: Double,
    val weekChangeP: Double,
    val yearChange: Double,
    val yearChangeP: Double
)