package com.cjayme.weatherapplication.presentation.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.cjayme.weatherapplication.presentation.theme.Typography

@Composable
fun WeatherAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}