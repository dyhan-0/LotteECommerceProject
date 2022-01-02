package com.dy.lotteecommerceproject.repository

import com.dy.lotteecommerceproject.util.ApiResponseCallback


interface DataRepository {
    suspend fun getMovieDetailInfo(query: String, callback: ApiResponseCallback)
}
