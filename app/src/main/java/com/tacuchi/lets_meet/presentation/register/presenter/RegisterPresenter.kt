package com.tacuchi.lets_meet.presentation.register.presenter

import com.tacuchi.lets_meet.presentation.register.RegisterContract
import javax.inject.Inject

class RegisterPresenter @Inject constructor(
    private val interactor: RegisterContract.Interactor
) : RegisterContract.Presenter {

    private lateinit var view: RegisterContract.View

    override fun attachView(view: RegisterContract.View) {
        this.view = view
    }

    override fun register(email: String, password: String) {
        TODO("Not yet implemented")
    }
}