package com.tacuchi.lets_meet.presentation.login.interactor

import com.tacuchi.lets_meet.domain.entity.User
import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.login.LoginContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class LoginInteractor @Inject constructor(
    private val authRepository: AuthRepository
) : LoginContract.Interactor {

    override fun signIn(callback: (User?, String?) -> Unit, email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val result = authRepository.signIn(email, password)
                withContext(Dispatchers.Main) {
                    if (result.isSuccess) {
                        callback(result.getOrNull(), null)
                    } else {
                        callback(null, result.exceptionOrNull()?.message)
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    callback(null, e.message)
                }
            }
        }
    }
}
