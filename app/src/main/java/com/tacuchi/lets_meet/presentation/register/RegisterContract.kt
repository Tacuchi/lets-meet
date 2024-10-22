package com.tacuchi.lets_meet.presentation.register

interface RegisterContract {
    interface View {
        fun showLoading()
        fun hideLoading()
        fun showSuccess()
        fun navigateToHome()
        fun showError()
    }

    interface Presenter {
        fun attachView(view: View)
        fun register(email: String, password: String)
    }

    interface Interactor {
        fun register(email: String, password: String, callback: (Boolean, String?) -> Unit)
    }
}