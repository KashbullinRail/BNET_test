package com.example.bnet_test.data

import com.example.bnet_test.data.model.MainRemoteModel


class MainRemoteSource(private val api: MainAPI) {

    suspend fun getProductList(): List<MainRemoteModel> {
        return api.getProductList()
    }

}
