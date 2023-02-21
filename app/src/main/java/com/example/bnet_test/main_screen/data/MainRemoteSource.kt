package com.example.bnet_test.main_screen.data

import com.example.bnet_test.main_screen.data.model.MainRemoteModel


class MainRemoteSource(private val api: MainAPI) {

    suspend fun getProductList(): List<MainRemoteModel> {
        return api.getProductList()
    }

}
