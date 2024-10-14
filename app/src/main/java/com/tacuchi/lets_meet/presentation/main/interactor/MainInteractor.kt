package com.tacuchi.lets_meet.presentation.main.interactor

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.main.MainContract
import javax.inject.Inject

class MainInteractor @Inject constructor(
    private val authRepository: AuthRepository
) : MainContract.Interactor {

    override fun isUserLoggedIn(callback: (Boolean) -> Unit) {
        val isLoggedIn = authRepository.getCurrentUser() != null
        callback(isLoggedIn)
    }
}