package com.example.bnet_test.domain


interface MainRepository {

    suspend fun getProductList(): List<MainModel>

}