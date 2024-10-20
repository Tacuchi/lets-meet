package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.register.RegisterContract
import com.tacuchi.lets_meet.presentation.register.interactor.RegisterInteractor
import com.tacuchi.lets_meet.presentation.register.presenter.RegisterPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RegisterModule {

    @Provides
    @Singleton
    fun provideRegisterPresenter(
        interactor: RegisterContract.Interactor
    ): RegisterContract.Presenter = RegisterPresenter(interactor)

    @Provides
    @Singleton
    fun provideRegisterInteractor(
        authRepository: AuthRepository
    ): RegisterContract.Interactor = RegisterInteractor(authRepository)
}