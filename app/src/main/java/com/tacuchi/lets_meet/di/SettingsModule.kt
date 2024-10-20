package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.presentation.settings.SettingsContract
import com.tacuchi.lets_meet.presentation.settings.interactor.SettingsInteractor
import com.tacuchi.lets_meet.presentation.settings.presenter.SettingsPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object SettingsModule {

    @Provides
    @Singleton
    fun provideSettingsPresenter(
        interactor: SettingsContract.Interactor
    ): SettingsContract.Presenter = SettingsPresenter(interactor)

    @Provides
    @Singleton
    fun provideSettingsInteractor(
    ): SettingsContract.Interactor = SettingsInteractor()
}