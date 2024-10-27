package com.tacuchi.lets_meet.di

import com.tacuchi.lets_meet.presentation.meetings.MeetingsContract
import com.tacuchi.lets_meet.presentation.meetings.interactor.MeetingsInteractor
import com.tacuchi.lets_meet.presentation.meetings.presenter.MeetingsPresenter
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MeetingsModule {

    @Provides
    @Singleton
    fun provideMeetingsPresenter(
        interactor: MeetingsContract.Interactor
    ): MeetingsContract.Presenter = MeetingsPresenter(interactor)

    @Provides
    @Singleton
    fun provideMeetingsInteractor(): MeetingsContract.Interactor = MeetingsInteractor()
}