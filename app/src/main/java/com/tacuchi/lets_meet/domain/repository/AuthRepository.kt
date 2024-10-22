package com.tacuchi.lets_meet.domain.repository

import com.google.firebase.auth.FirebaseUser
import com.tacuchi.lets_meet.domain.entity.User

interface AuthRepository {
    suspend fun signIn(email: String, password: String): Result<User>
    fun getCurrentUser(): FirebaseUser?
    suspend fun signUp(email: String, password: String): Result<User>
    fun signOut()
}
