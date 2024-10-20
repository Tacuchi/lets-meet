package com.tacuchi.lets_meet.presentation.register.interactor

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.register.RegisterContract
import javax.inject.Inject

class RegisterInteractor @Inject constructor(
    private val authRepository: AuthRepository
) : RegisterContract.Interactor {

    override fun register(callback: (Boolean, String?) -> Unit, email: String, password: String) {
        TODO("Not yet implemented")
    }
}