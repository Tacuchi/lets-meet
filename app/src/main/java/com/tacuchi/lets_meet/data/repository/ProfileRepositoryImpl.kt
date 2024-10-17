package com.tacuchi.lets_meet.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.tacuchi.lets_meet.domain.repository.ProfileRepository
import javax.inject.Inject

class ProfileRepositoryImpl @Inject constructor(
    private val firebaseAuth: FirebaseAuth
) : ProfileRepository {
}