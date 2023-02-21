package com.example.bnet_test.data

import com.example.bnet_test.data.model.MainRemoteModel
import retrofit2.http.GET
import retrofit2.http.Query


interface MainAPI {

    @GET("api/ppp/index")
    suspend fun getProductList(
//        @Query("id") id: Int = ,     // id категории препарата
        @Query("search") search: String = "",      //поиск по тексту
//        @Query("crop_id") cropId: Int,    //id культуры
//        @Query("harmful_object_id") harmfulObjectId: Int,    //id вредного объекта, поле для подходящих препаратов
//        @Query("ingredient_id") ingredientId: Int,       //id действующего вещества
//        @Query("offset") offset: Int,          //смещение
//        @Query("limit") limit: Int,        //ограничение
    ): List<MainRemoteModel>



}