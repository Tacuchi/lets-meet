package com.tacuchi.lets_meet.di

import com.google.firebase.auth.FirebaseAuth
import com.tacuchi.lets_meet.data.repository.AuthRepositoryImpl
import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.login.LoginContract
import com.tacuchi.lets_meet.presentation.login.interactor.LoginInteractor
import com.tacuchi.lets_meet.presentation.login.presenter.LoginPresenter
import com.tacuchi.lets_meet.presentation.login.router.LoginRouter
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
        router: LoginContract.Router,
        interactor: LoginContract.Interactor
    ): LoginContract.Presenter = LoginPresenter(router, interactor)

    @Provides
    @Singleton
    fun provideLoginInteractor(
        authRepository: AuthRepository
    ): LoginContract.Interactor = LoginInteractor(authRepository)

    @Provides
    @Singleton
    fun provideAuthRepository(
        firebaseAuth: FirebaseAuth
    ): AuthRepository = AuthRepositoryImpl(firebaseAuth)

    @Provides
    @Singleton
    fun provideLoginRouter(): LoginContract.Router = LoginRouter()
}