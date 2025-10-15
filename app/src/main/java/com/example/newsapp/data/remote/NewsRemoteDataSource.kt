package com.example.newsapp.data.remote

import javax.inject.Inject

class NewsRemoteDataSource @Inject constructor(
    private val api:NewsApiService
)