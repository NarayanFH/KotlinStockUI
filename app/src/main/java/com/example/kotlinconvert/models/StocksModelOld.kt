//package com.example.kotlinconvert.models
//
//import com.google.gson.annotations.SerializedName
//data class StocksModelOld(
//    var page: Int = 0,
//    @SerializedName("data") var data: ArrayList<Data> = arrayListOf(),
//)
//
////package com.example.kotlinconvert.models
////
////import com.google.gson.annotations.Expose
////import com.google.gson.annotations.SerializedName
////
////class com.example.kotlinconvert.models.StocksModel {
////    constructor() {}
////
////    var page = 0
////
////    @SerializedName("data")
////    @Expose
////    lateinit var dataList: List<com.example.kotlinconvert.models.com.example.kotlinconvert.models.Data>
////
////    class com.example.kotlinconvert.models.com.example.kotlinconvert.models.Data {
////        @SerializedName("stockData")
////        @Expose
////        lateinit var stockData: com.example.kotlinconvert.models.StockData
////
////        class com.example.kotlinconvert.models.StockData {
////            @SerializedName("stockName")
////            @Expose
////            lateinit var stockName: String
////
////            @SerializedName("sectorName")
////            @Expose
////            lateinit var sectorName: String
////
////            @SerializedName("currentPrice")
////            @Expose
////            lateinit var currentPrice: String
////
////            @SerializedName("dayChangeP")
////            @Expose
////            lateinit var dayChangeP: String
////
////            @SerializedName("yearChangeP")
////            @Expose
////            lateinit var yearChangeP: String
////        }
////    }
////}