package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.domain.repository.ProfileRepository
import com.tacuchi.lets_meet.presentation.profile.ProfileContract
import com.tacuchi.lets_meet.presentation.profile.interactor.ProfileInteractor
import com.tacuchi.lets_meet.presentation.profile.presenter.ProfilePresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ProfileModule {

    @Provides
    @Singleton
    fun provideProfilePresenter(
        interactor: ProfileContract.Interactor
    ): ProfileContract.Presenter = ProfilePresenter(interactor)

    @Provides
    @Singleton
    fun provideProfileInteractor(
        profileRepository: ProfileRepository,
        authRepository: AuthRepository
    ): ProfileContract.Interactor = ProfileInteractor(profileRepository, authRepository)
}