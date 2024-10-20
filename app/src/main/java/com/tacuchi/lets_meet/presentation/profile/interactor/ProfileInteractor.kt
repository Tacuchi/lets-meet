package com.tacuchi.lets_meet.presentation.profile.interactor

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.domain.repository.ProfileRepository
import com.tacuchi.lets_meet.presentation.profile.ProfileContract

class ProfileInteractor constructor(
    private val profileRepository: ProfileRepository,
    private val authRepository: AuthRepository
) : ProfileContract.Interactor {

    override fun fetchProfile(callback: (String) -> Unit) {
        TODO("Not yet implemented")
    }

    override fun logout(callback: () -> Unit) {
        authRepository.signOut()
        callback()
    }
}