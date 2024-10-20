package com.tacuchi.lets_meet.presentation.login.presenter

import com.tacuchi.lets_meet.presentation.login.LoginContract
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val interactor: LoginContract.Interactor
) : LoginContract.Presenter {

    private lateinit var view: LoginContract.View

    override fun attachView(view: LoginContract.View) {
        this.view = view
    }

    override fun login(email: String, password: String) {
        interactor.signIn({ user ->
            if (user != null) {
                view.navigateToHome(user)
            } else {
                view.showLoginError("Login failed")
            }
        }, email, password)
    }
}
