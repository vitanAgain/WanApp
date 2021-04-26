package com.weitian.wanapp.network

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL="https://www.wanandroid.com/"

// 一个retrofit至少需要一个url以及一个converterFactory
private val retrofit=Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface HomePageApiService{
    @GET("article/list/0/json")
    fun getArticles(): Call<String>
}

object HomePageApi{
    // 使用接口创建retrofit单例服务，因为时间开销大，采用了延迟实例化（直到使用时才初始化）
    val retrofitService: HomePageApiService by lazy {
        retrofit.create(HomePageApiService::class.java)
    }

}


