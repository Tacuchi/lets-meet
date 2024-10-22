package com.tacuchi.lets_meet.presentation.register.interactor

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.register.RegisterContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RegisterInteractor @Inject constructor(
    private val authRepository: AuthRepository
) : RegisterContract.Interactor {

    override fun register(email: String, password: String, callback: (Boolean, String?) -> Unit) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                val result = authRepository.signUp(email, password)
                withContext(Dispatchers.Main) {
                    if (result.isSuccess) {
                        callback(true, null)
                    } else {
                        callback(false, result.exceptionOrNull()?.message)
                    }
                }
            } catch (e: Exception) {
                withContext(Dispatchers.Main) {
                    callback(false, e.message)
                }
            }
        }
    }
}