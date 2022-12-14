package com.example.kotlinconvert.fragments

import android.app.ProgressDialog
import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinconvert.R
import com.example.kotlinconvert.RetrofitAPI
import com.example.kotlinconvert.Utils.NetworkClass
import com.example.kotlinconvert.adapters.StocksRVAdapter
import com.example.kotlinconvert.databinding.FragmentAllStocksBinding
import com.example.kotlinconvert.models.DataX
import com.example.kotlinconvert.models.StockPage
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import okhttp3.ResponseBody
import org.json.JSONObject
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllStocks : Fragment() {
    var mBinding: FragmentAllStocksBinding? = null
    private var stocksModelList: ArrayList<DataX>? = null
    var page = 1

    @RequiresApi(api = Build.VERSION_CODES.M)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_all_stocks,
            container,
            false
        )
        getDataFromAPI(page)
        stocksModelList = ArrayList()
        mBinding!!.rvStocksMain.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (!recyclerView.canScrollVertically(1) && newState == RecyclerView.SCROLL_STATE_IDLE) {
                    page++
                    getDataFromAPI(page)
                    println("Page Number: $page")
                }
            }
        })
        return mBinding!!.root
    }

    private fun getDataFromAPI(page: Int) {
        val progressDialog = ProgressDialog(activity)
        progressDialog.setMessage("Please Wait...")
        progressDialog.setCancelable(false)
        progressDialog.show()
        val stockPage = StockPage()
        stockPage.page = page

        NetworkClass.apiClient().create(RetrofitAPI::class.java).getPageStocks(stockPage)
            .enqueue(object : Callback<ResponseBody> {
                override fun onResponse(
                    call: Call<ResponseBody>,
                    response: Response<ResponseBody>
                ) {
                    println("Response body:" + response.body().toString()) //TODO: Replace with Log
                    try {
                        val jsonObject = JSONObject(response.body()!!.string())
                        val dataArray = jsonObject.getJSONArray("data")
                        println("Data array:${dataArray[1]}")

                        stocksModelList!!.addAll(
                            Gson().fromJson(
                                jsonObject.optString("data", ""),
                                object : TypeToken<List<DataX?>?>() {}.type
                            )
                        )
                        println(stocksModelList)
                        mBinding!!.rvStocksMain.adapter = StocksRVAdapter(stocksModelList!!, activity!!)
                        val scrollToLastPosition = (page - 1).toString() + 0
                        println(scrollToLastPosition)
                        mBinding!!.rvStocksMain.scrollToPosition(scrollToLastPosition.toInt())
                        progressDialog.dismiss()
                    } catch (e: Exception) {
                        e.printStackTrace()
                    }
                }
                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
                    progressDialog.dismiss()
                    println("Error From APi  ......" + t.message)
                }
            })
    }
}

