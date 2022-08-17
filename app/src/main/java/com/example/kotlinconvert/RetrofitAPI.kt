package com.example.kotlinconvert
import com.example.kotlinconvert.models.StockPage
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface RetrofitAPI {
    //    @POST("stocks/getstockdata/")
    //    Call<com.example.kotlinconvert.models.StocksModel> getPageStocks(@Body com.example.kotlinconvert.models.StocksModel stocksModel);
    @POST("stocks/getstockdata/")
    fun getPageStocks(@Body stockPage: StockPage): Call<ResponseBody>
}