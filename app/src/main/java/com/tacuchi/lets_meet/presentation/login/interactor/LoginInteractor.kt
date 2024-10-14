package com.tacuchi.lets_meet.presentation.login.interactor

import com.tacuchi.lets_meet.domain.entity.User
import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.login.LoginContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

class LoginInteractor @Inject constructor(
    private val authRepository: AuthRepository
) : LoginContract.Interactor {

    override fun login(callback: (User?) -> Unit, email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            val result = authRepository.login(email, password)
            callback(result.getOrNull())
        }
    }
}
