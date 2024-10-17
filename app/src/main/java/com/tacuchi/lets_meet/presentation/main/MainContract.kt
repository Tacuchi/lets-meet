package com.tacuchi.lets_meet.presentation.main

interface MainContract {
    interface View {
        fun initFragments()
        fun showMessage(msg: String)
        fun navigateToLogin()
    }

    interface Presenter {
        fun attachView(view: View)
        fun checkUserStatus()
    }

    interface Interactor {
        fun isUserLoggedIn(callback: (Boolean) -> Unit)
    }
}