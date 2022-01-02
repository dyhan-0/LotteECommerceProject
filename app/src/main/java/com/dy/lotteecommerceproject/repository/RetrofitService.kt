package com.dy.lotteecommerceproject.repository

import com.dy.lotteecommerceproject.model.SearchInfo
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {

    /**
     * 상세정보 요청
     */
    @GET("search_json2.jsp?")
    fun getMovieDetailInfo(
        @Query("collection") collection: String = "kmdb_new2",
        @Query("detail") detail: String = "Y",
        @Query("listCount") listCount: Int = 100,
        @Query("ServiceKey") ServiceKey: String = "5N088Z6585864T74677P",
        @Query("query") query: String
    ): Call<SearchInfo>

}