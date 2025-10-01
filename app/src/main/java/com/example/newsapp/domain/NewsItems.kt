package com.example.newsapp.domain

import androidx.compose.runtime.Immutable

@Immutable
data class NewsItems (
    val status:String,
    val totalResults:Int,
    val articles:List<NewsItemList>
)