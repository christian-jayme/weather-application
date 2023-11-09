package com.cjayme.weatherapplication.data.repository

import com.cjayme.weatherapplication.data.mappers.toWeatherInfo
import com.cjayme.weatherapplication.data.remote.WeatherApi
import com.cjayme.weatherapplication.domain.repository.WeatherRepository
import com.cjayme.weatherapplication.domain.util.Resource
import com.cjayme.weatherapplication.domain.weather.WeatherInfo
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}