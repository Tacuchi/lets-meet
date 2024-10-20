package com.tacuchi.lets_meet.presentation.register

class RegisterContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun navigateToHome()
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun register(email: String, password: String)
    }

    interface Interactor {
        fun register(callback: (Boolean, String?) -> Unit, email: String, password: String)
    }
}