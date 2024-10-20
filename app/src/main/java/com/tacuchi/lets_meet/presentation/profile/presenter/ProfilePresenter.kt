package com.tacuchi.lets_meet.presentation.profile.presenter

import com.tacuchi.lets_meet.presentation.profile.ProfileContract
import com.tacuchi.lets_meet.presentation.profile.view.ProfileFragment
import javax.inject.Inject

class ProfilePresenter @Inject constructor(
    private val interactor: ProfileContract.Interactor
) : ProfileContract.Presenter {

    private lateinit var view: ProfileContract.View

    override fun attachView(view: ProfileContract.View) {
        this.view = view
    }

    override fun getProfile() {
        interactor.fetchProfile { profile ->
            view.showProfile(profile)
        }
    }

    override fun logout() {
        interactor.logout {
            view.returnToLogin()
        }
    }
}