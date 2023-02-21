package com.example.bnet_test.main_screen.domain


interface MainRepository {

    suspend fun getProductList(): List<MainScreenModel>

}