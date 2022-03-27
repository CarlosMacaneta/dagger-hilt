package com.cmj.daggerhilttrain

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    @Provides
    @ActivityScoped
    @Named("fun2")
    fun provideTestStr(
        @ApplicationContext context: Context,
        @Named("fun1") testOfAnotherFun: String
    ) = "${context.getString(R.string.word)} - $testOfAnotherFun"
}