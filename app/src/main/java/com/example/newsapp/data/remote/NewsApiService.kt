package com.example.newsapp.data.remote

import com.example.newsapp.BuildConfig
import com.example.newsapp.data.response.NewsItemsResponse
import com.example.newsapp.network.ApiResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApiService {
    @GET("top-headlines")
    suspend fun getTopHeadlines(
        @Query("country") country: String = "us",
        @Query("category")category:String,
        @Query("apiKey") apiKey: String = BuildConfig.NEWS_SECRET_KEYuk
    ): ApiResponse<NewsItemsResponse>
}