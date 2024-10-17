package com.tacuchi.lets_meet.presentation.profile

interface ProfileContract {
    interface View {
        fun showProfile(profile: String)
    }

    interface Presenter {
        fun attachView(view: View)
        fun getProfile()
    }

    interface Interactor {
        fun fetchProfile(callback: (String) -> Unit)
    }
}