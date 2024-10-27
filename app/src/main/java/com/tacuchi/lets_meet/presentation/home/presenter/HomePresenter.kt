package com.tacuchi.lets_meet.presentation.home.presenter

import com.tacuchi.lets_meet.presentation.home.HomeContract
import javax.inject.Inject

class HomePresenter @Inject constructor(
    private val interactor: HomeContract.Interactor
) : HomeContract.Presenter {

    private lateinit var view: HomeContract.View

    override fun attachView(view: HomeContract.View) {
        this.view = view
    }

    override fun getUpcomingMeetings() {
        TODO("Not yet implemented")
    }

    override fun getContacts() {
        TODO("Not yet implemented")
    }
}