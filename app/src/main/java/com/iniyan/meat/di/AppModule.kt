package com.iniyan.meat.di

import com.iniyan.data.network.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import javax.inject.Singleton

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