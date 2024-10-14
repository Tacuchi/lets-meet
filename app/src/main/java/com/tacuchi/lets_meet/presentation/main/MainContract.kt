package com.tacuchi.lets_meet.presentation.main

import com.tacuchi.lets_meet.presentation.main.view.MainActivity

interface MainContract {
    interface View {
        fun initFragments()
        fun showMessage(msg: String)
    }

    interface Presenter {
        fun attachView(view: View)
        fun checkUserStatus()
    }

    interface Interactor {
        fun isUserLoggedIn(callback: (Boolean) -> Unit)
    }

    interface Router {
        fun attachActivity(activity: MainActivity)
        fun navigateToLogin()
    }
}