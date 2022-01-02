package com.dy.lotteecommerceproject.repository

import com.dy.lotteecommerceproject.model.SearchInfo
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.lang.Exception

import com.dy.lotteecommerceproject.util.Results
import com.dy.lotteecommerceproject.util.ApiResponseCallback
import javax.inject.Inject


class DataRepositoryImpl @Inject constructor(
    private val retrofitService: RetrofitService
): DataRepository  {

    override suspend fun getMovieDetailInfo(query: String, callback: ApiResponseCallback) {

        val collection = "kmdb_new2"
        val detail = "Y"
        val listCount = 100
        val serviceKey = "5N088Z6585864T74677P"

        retrofitService.getMovieDetailInfo(collection,detail,listCount,serviceKey,query).enqueue(object : Callback<SearchInfo> {
            override fun onFailure(call: Call<SearchInfo>, t: Throwable) {
                callback(Results.Error(Exception()))
            }

            override fun onResponse(call: Call<SearchInfo>, response: Response<SearchInfo>) {
                if(response.isSuccessful) {
                    callback(Results.Success(response.body()!!))
                }else {
                    callback(Results.Error(Exception()))
                }
            }
        })
    }
}