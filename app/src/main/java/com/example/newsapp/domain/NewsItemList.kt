package com.example.newsapp.domain

import androidx.compose.runtime.Immutable

@Immutable
data class NewsItemList (
    val source: SourceList,
    val author: String,
    val title:String,
    val description:String,
    val url:String,
    val urlToImage:String,
    val publishedAt:String,
    val content:String
)