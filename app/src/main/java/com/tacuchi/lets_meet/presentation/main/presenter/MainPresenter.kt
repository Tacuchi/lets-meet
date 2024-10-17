package com.tacuchi.lets_meet.presentation.main.presenter

import com.tacuchi.lets_meet.presentation.main.MainContract
import com.tacuchi.lets_meet.presentation.main.view.MainActivity
import javax.inject.Inject

class MainPresenter @Inject constructor(
    private val interactor: MainContract.Interactor
) : MainContract.Presenter {

    private lateinit var view: MainContract.View

    override fun attachView(view: MainContract.View) {
        this.view = view
    }

    override fun checkUserStatus() {
        interactor.isUserLoggedIn { isLoggedIn ->
            if (!isLoggedIn) {
                view.navigateToLogin()
            } else {
                view.initFragments()
            }
        }
    }
}