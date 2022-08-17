package com.example.kotlinconvert

class RawOld {


//                override fun onResponse(
//                    call: Call<ResponseBody>,
//                    response: Response<ResponseBody>
//                ) {
//                    val jsonObject = JSONObject(response.body()!!.string())
//                    val gson = Gson()
//                    val dataArray = jsonObject.getJSONObject("data").toString()
//                    val stocksDetailsData = gson.fromJson(
//                        dataArray,
//                        StockModel::class.java
//                    )
//                    println(stocksDetailsData.data)
//                    progressDialog.dismiss()
//
////                    stocksRVAdapter =
////                        activity?.let { stocksModelList?.let { it1 -> StocksRVAdapter(it1, it) } }
//
////                    stocksRVAdapter = stocksModelList?.let { activity?.let { it1 ->
////                            StocksRVAdapter(it,
////                                it1
////                            )
////                        } }
////                        stocksModelList!!.addAll(
////                            listOf(
////                                gson.fromJson(
////                                    dataArray,
////                                    StocksModelOld::class.java
////                                )
////                            )
////                        )
//
//                }
////                override fun onResponse(
////                    call: Call<com.example.kotlinconvert.models.StocksModel>,
////                    response: Response<com.example.kotlinconvert.models.StocksModel>
////                )
////                {
////                    val responseList: com.example.kotlinconvert.models.StocksModel? = response.body()
////                    println("Rewewewpone:$responseList")
//////                    println("Response body:" + response.body())
//////                    Log.e("Stock Rwspnseo:--", response.body().toString())
//////                    try {
//////                        val jsonObject = JSONObject(response.body()!!.string())
////////                        val dataArray: JSONArray = jsonObject.getJSONArray("data")
//////                        Log.e("jsonObjectasset", jsonObject.toString())
//////                        val value: String = jsonObject.optString("data", "")
//////                        val gson = Gson()
//////                        val typeToken: Type = object : TypeToken<List<com.example.kotlinconvert.models.StocksModel?>?>() {}.type
//////
//////                        stocksRVAdapter = stocksModelList?.let { activity?.let { it1 ->
//////                            StocksRVAdapter(it,
//////                                it1
//////                            )
//////                        } }
//////                        stocksModelList!!.addAll(
//////                            gson.fromJson(
//////                                value,
//////                                typeToken
//////                            )
//////                        )
//////                        mBinding.rvStocksMain.layoutManager = LinearLayoutManager(activity)
//////                        mBinding.rvStocksMain.adapter = stocksRVAdapter
//////                        val scrollToLastPosition = (page - 1).toString() + 0
//////                        mBinding.rvStocksMain.scrollToPosition(scrollToLastPosition.toInt())
//////                        stocksRVAdapter?.updateDataSet(stocksModelList)
//////                        println(savedPage)
////                        progressDialog.dismiss()
//////                    } catch (e: IOException) {
//////                        e.printStackTrace()
//////                    } catch (e: JSONException) {
//////                        e.printStackTrace()
//////                    }
////                }
//
//                override fun onFailure(call: Call<ResponseBody>, t: Throwable) {
//                    progressDialog.dismiss()
//                    println("Error From APi  ......" + t.message)
//                }
}