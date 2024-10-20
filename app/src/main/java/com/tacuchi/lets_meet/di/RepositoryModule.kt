package com.tacuchi.lets_meet.di

import com.google.firebase.auth.FirebaseAuth
import com.tacuchi.lets_meet.data.repository.AuthRepositoryImpl
import com.tacuchi.lets_meet.data.repository.ProfileRepositoryImpl
import com.tacuchi.lets_meet.domain.repository.AuthRepository
import com.tacuchi.lets_meet.domain.repository.ProfileRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideAuthRepository(
        firebaseAuth: FirebaseAuth
    ): AuthRepository = AuthRepositoryImpl(firebaseAuth)

    @Provides
    @Singleton
    fun provideProfileRepository(
        firebaseAuth: FirebaseAuth
    ): ProfileRepository = ProfileRepositoryImpl(firebaseAuth)
}