package com.example.newsapp.data.response

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SourceListResponse(
    @SerialName("id")
    val id: String,
    @SerialName("name")
    val name: String
)