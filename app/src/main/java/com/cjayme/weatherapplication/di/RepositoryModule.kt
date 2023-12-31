package com.cjayme.weatherapplication.di

import com.cjayme.weatherapplication.data.location.DefaultLocationTracker
import com.cjayme.weatherapplication.data.repository.WeatherRepositoryImpl
import com.cjayme.weatherapplication.domain.location.LocationTracker
import com.cjayme.weatherapplication.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(
        weatherRepositoryImpl: WeatherRepositoryImpl
    ): WeatherRepository
}