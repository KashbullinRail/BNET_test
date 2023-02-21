package com.example.bnet_test.data

import com.example.bnet_test.data.model.MainRemoteModel
import com.example.bnet_test.domain.MainModel


fun MainRemoteModel.toDomain() = MainModel(
    id = id ?: 0,
    image = img ?: "",
)