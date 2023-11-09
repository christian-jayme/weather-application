package com.cjayme.weatherapplication.domain.repository

import com.cjayme.weatherapplication.domain.util.Resource
import com.cjayme.weatherapplication.domain.weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}