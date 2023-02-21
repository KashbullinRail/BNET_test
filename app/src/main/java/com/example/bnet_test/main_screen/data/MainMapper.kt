package com.example.bnet_test.main_screen.data

import com.example.bnet_test.main_screen.data.model.MainRemoteModel
import com.example.bnet_test.main_screen.domain.MainScreenModel


fun MainRemoteModel.toDomain() = MainScreenModel(
    id = id ?: 0,
    image = img ?: "",
)