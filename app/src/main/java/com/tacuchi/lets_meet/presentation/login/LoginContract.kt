package com.tacuchi.lets_meet.presentation.login

import com.tacuchi.lets_meet.domain.entity.User
import com.tacuchi.lets_meet.presentation.login.view.ui.login.LoginActivity

interface LoginContract {
    interface View {
        fun showLoginError(message: String)
    }

    interface Presenter {
        fun attachView(view: View)
        fun detachView()
        fun onLoginButtonClicked(email: String, password: String)
    }

    interface Interactor {
        fun login(callback: (User?) -> Unit, email: String, password: String)
    }

    interface Router {
        fun attachActivity(activity: LoginActivity)
        fun navigateToHome(user: User)
        fun navigateToRegister()
    }
}