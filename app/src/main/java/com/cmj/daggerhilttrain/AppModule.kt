package com.cmj.daggerhilttrain

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton // single instance of a string
    @Provides // tells the dagger-hilt dependency that with this function we want to provide a string
    @Named("fun1")
    fun provideTestString() = "Testing this provided string"
}