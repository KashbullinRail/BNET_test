package com.example.bnet_test.main_screen.presentation

import com.example.bnet_test.base.Event
import com.example.bnet_test.main_screen.domain.MainScreenModel


enum class State {
    Load,
    Content,
    DetailLoad,
    Error
}

data class ViewState(
    val state: State,
    val companyShown: List<MainScreenModel>,
    val companiesList: List<MainScreenModel>,
    val companyDetail: MainScreenModel
)

sealed class UIEvent : Event {
    data class OnCompanyClicked(val index: Int) : UIEvent()
}

sealed class DateEvent : Event {
    object LoadCompanies : DateEvent()
    data class OnLoadCompaniesSucceed(val companies: List<MainScreenModel>) : DateEvent()
}