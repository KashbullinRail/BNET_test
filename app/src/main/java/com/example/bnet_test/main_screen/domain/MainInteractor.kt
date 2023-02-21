package com.example.bnet_test.main_screen.domain

import com.example.bnet_test.base.attempt


class MainInteractor(private val repository: MainRepository) {

    suspend fun getProductList() = attempt {
        repository.getProductList()
    }

}



