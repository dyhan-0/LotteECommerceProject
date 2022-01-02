package com.dy.lotteecommerceproject.di

import com.dy.lotteecommerceproject.repository.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn

import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {

    private const val basicServerUrl = "http://api.koreafilm.or.kr/openapi-data2/wisenut/search_api/"

    @Provides
    fun provideRetrofitService(
        okHttpClient: OkHttpClient,
        converterFactory: GsonConverterFactory
    ): RetrofitService {
        return Retrofit.Builder()
            .baseUrl(basicServerUrl)
            .addConverterFactory(converterFactory)
//            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .client(okHttpClient)
            .build()
            .create(RetrofitService::class.java)
    }


}