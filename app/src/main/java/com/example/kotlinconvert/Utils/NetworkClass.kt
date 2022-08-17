package com.example.kotlinconvert.Utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkInfo
import retrofit2.Retrofit
import com.example.kotlinconvert.Utils.NetworkClass
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import java.util.concurrent.TimeUnit

object NetworkClass {
    fun isInternetAvailable(ctx: Context?): Boolean {
        if (ctx != null) {
            val cm = (ctx.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager)
            val networkInfo = cm.activeNetworkInfo
            return networkInfo != null && networkInfo.isConnected
        }
        return false
    }

    fun apiClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .client(buildHTTPClient())
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    private fun buildHTTPClient(): OkHttpClient {
        val httpClient = OkHttpClient.Builder()
        httpClient.connectTimeout(30000, TimeUnit.SECONDS)
            .writeTimeout(30000, TimeUnit.SECONDS)
            .readTimeout(30000, TimeUnit.SECONDS)
        return httpClient.build()
    }
}