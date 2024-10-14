package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.presentation.main.MainContract
import com.tacuchi.lets_meet.presentation.main.interactor.MainInteractor
import com.tacuchi.lets_meet.presentation.main.presenter.MainPresenter
import com.tacuchi.lets_meet.presentation.main.router.MainRouter
import com.tacuchi.lets_meet.presentation.main.view.MainActivity
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MainModule {

    @Provides
    @Singleton
    fun provideMainPresenter(
        router: MainContract.Router, interactor: MainContract.Interactor
    ): MainContract.Presenter = MainPresenter(router, interactor)

    @Provides
    @Singleton
    fun provideMainInteractor(
        authRepository: AuthRepository
    ): MainContract.Interactor = MainInteractor(authRepository)

    @Provides
    @Singleton
    fun provideMainRouter(
    ): MainContract.Router = MainRouter()
}