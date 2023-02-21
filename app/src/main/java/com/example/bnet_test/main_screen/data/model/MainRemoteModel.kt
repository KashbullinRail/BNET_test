package com.example.bnet_test.data.model

import com.google.gson.annotations.SerializedName


data class MainRemoteModel(
    @SerializedName("id")
    val id: Int?,
    @SerializedName("img")
    val img: String?
)