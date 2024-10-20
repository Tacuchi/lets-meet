package com.tacuchi.lets_meet.presentation.profile

interface ProfileContract {
    interface View {
        fun showProfile(profile: String)
        fun returnToLogin()
    }

    interface Presenter {
        fun attachView(view: View)
        fun getProfile()
        fun logout()
    }

    interface Interactor {
        fun fetchProfile(callback: (String) -> Unit)
        fun logout(callback: () -> Unit)
    }
}