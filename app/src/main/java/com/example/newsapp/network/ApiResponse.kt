package com.example.newsapp.network

import org.jetbrains.annotations.ApiStatus

data class ApiResponse <T>(
    val status:ApiStatus,
    val data:T?=null,
    val message:String?=null
)