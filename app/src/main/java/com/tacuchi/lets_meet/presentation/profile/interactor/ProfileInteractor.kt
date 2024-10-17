package com.tacuchi.lets_meet.presentation.profile.interactor

import com.tacuchi.lets_meet.domain.repository.ProfileRepository
import com.tacuchi.lets_meet.presentation.profile.ProfileContract

class ProfileInteractor constructor(
    private val repository: ProfileRepository
) : ProfileContract.Interactor {

    override fun fetchProfile(callback: (String) -> Unit) {
        TODO("Not yet implemented")
    }
}