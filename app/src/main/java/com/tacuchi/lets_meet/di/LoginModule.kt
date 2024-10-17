package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.login.LoginContract
import com.tacuchi.lets_meet.presentation.login.interactor.LoginInteractor
import com.tacuchi.lets_meet.presentation.login.presenter.LoginPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LoginModule {

    @Provides
    @Singleton
    fun provideLoginPresenter(
        interactor: LoginContract.Interactor
    ): LoginContract.Presenter = LoginPresenter(interactor)

    @Provides
    @Singleton
    fun provideLoginInteractor(
        authRepository: AuthRepository
    ): LoginContract.Interactor = LoginInteractor(authRepository)
}