package com.example.bnet_test.main_screen.data.model

import com.example.bnet_test.main_screen.data.MainRemoteSource
import com.example.bnet_test.main_screen.data.toDomain
import com.example.bnet_test.main_screen.domain.MainRepository
import com.example.bnet_test.main_screen.domain.MainScreenModel


class MainRemoteRepositoryImpl(private val source: MainRemoteSource) :
    MainRepository {

    override suspend fun getProductList(): List<MainScreenModel> {
        return source.getProductList().map {
            it.toDomain()
        }
    }

}