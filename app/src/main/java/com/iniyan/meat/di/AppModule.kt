package com.iniyan.meat.di

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

//    @Provides
//    @Singleton
//    fun providesApi() : Api {
//        return Retrofit.Builder()
//            .baseUrl("")
//    }
}