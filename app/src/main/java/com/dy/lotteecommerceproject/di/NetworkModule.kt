package com.dy.lotteecommerceproject.di

import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


import okhttp3.Interceptor
import okhttp3.OkHttpClient

import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.converter.gson.GsonConverterFactory

import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val httpBuilder = OkHttpClient.Builder()
        httpBuilder.connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(60, TimeUnit.SECONDS)
            .writeTimeout(60, TimeUnit.SECONDS)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level =
//                    HttpLoggingInterceptor.Level.NONE
                        HttpLoggingInterceptor.Level.BODY
            })   // show all JSON in logCat
            .addInterceptor(Interceptor { chain ->
                val builder = chain.request().newBuilder()
                builder.addHeader("token", "")
                    .addHeader("dataTye", "json")
                    .addHeader("user-agent", "Client-Android")
                chain.proceed(builder.build())
            })  // add request header(sessionid etc.)
        return httpBuilder.build()
    }

    @Provides
    fun provideGsonConverterFactory(): GsonConverterFactory {
        return GsonConverterFactory
            .create(
                GsonBuilder()
                    .setLenient()
                    .disableHtmlEscaping()
                    .create()
            )
    }

}