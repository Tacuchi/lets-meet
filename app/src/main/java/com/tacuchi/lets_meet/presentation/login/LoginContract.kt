package com.tacuchi.lets_meet.presentation.login

import com.tacuchi.lets_meet.domain.entity.User

interface LoginContract {
    interface View {
        fun showLoginError(message: String)
        fun navigateToHome(user: User)
        fun navigateToRegister()
        // je.loayzat@gmail.com / 123456
    }

    interface Presenter {
        fun attachView(view: View)
        fun login(email: String, password: String)
    }

    interface Interactor {
        fun signIn(callback: (User?, String?) -> Unit, email: String, password: String)
    }
}