package com.bits.template.di

import android.content.Context
import com.bits.template.data.local.database.AppDatabase
import com.bits.template.data.local.database.daos.PersonsDao
import com.bits.template.data.network.utils.NetworkInterceptor
import com.bits.template.data.network.Api
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext appContext: Context): AppDatabase {
        return AppDatabase.invoke(appContext)
    }

    @Provides
    fun providePersonsDao(appDatabase: AppDatabase): PersonsDao {
        return appDatabase.getPersonsDao()
    }

    @Provides
    fun provideApi(networkInterceptor: NetworkInterceptor) : Api {
        return Api.invoke(networkInterceptor)
    }
}