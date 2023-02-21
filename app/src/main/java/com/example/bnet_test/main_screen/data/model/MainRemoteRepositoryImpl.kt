package com.example.bnet_test.data.model

import com.example.bnet_test.data.MainRemoteSource
import com.example.bnet_test.data.toDomain
import com.example.bnet_test.domain.MainModel
import com.example.bnet_test.domain.MainRepository


class MainRemoteRepositoryImpl(private val source: MainRemoteSource) :
    MainRepository {

    override suspend fun getProductList(): List<MainModel> {
        return source.getProductList().map {
            it.toDomain()
        }
    }

}