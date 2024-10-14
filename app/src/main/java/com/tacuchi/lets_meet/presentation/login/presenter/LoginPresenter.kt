package com.tacuchi.lets_meet.presentation.login.presenter

import com.tacuchi.lets_meet.presentation.login.LoginContract
import com.tacuchi.lets_meet.presentation.login.view.ui.login.LoginActivity
import javax.inject.Inject

class LoginPresenter @Inject constructor(
    private val router: LoginContract.Router,
    private val interactor: LoginContract.Interactor
) : LoginContract.Presenter {

    private var view: LoginContract.View? = null

    override fun attachView(view: LoginContract.View) {
        this.view = view
        this.router.attachActivity(view as LoginActivity)
    }

    override fun detachView() {
        view = null
    }

    override fun onLoginButtonClicked(email: String, password: String) {
        interactor.login({ user ->
            if (user != null) {
                router.navigateToHome(user)
            } else {
                view?.showLoginError("Login failed")
            }
        }, email, password)
    }
}
