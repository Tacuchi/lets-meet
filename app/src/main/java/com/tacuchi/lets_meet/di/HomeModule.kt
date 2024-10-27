package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.presentation.home.HomeContract
import com.tacuchi.lets_meet.presentation.home.interactor.HomeInteractor
import com.tacuchi.lets_meet.presentation.home.presenter.HomePresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object HomeModule {

    @Provides
    @Singleton
    fun provideHomePresenter(
        interactor: HomeContract.Interactor
    ): HomeContract.Presenter = HomePresenter(interactor)

    @Provides
    @Singleton
    fun provideHomeInteractor(
    ): HomeContract.Interactor = HomeInteractor()
}