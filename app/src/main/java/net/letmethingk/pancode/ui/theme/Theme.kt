package net.letmethingk.pancode.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    surface = Darkgrey,
    surfaceVariant = DarkgreyV1,
    surfaceDim = DarkgreyV2,
    surfaceContainer = GreyV2,
    surfaceContainerLow = Darkgrey,
    surfaceContainerHigh = GreyV1,
    outline = Grey,
    background = Darkgrey,
    error = Red,

    onPrimary = White,
    onSecondary = White,
    onSurface = White,
    onSurfaceVariant = White,
    onBackground = White,
    onError = White,
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    surface = DarkWhite,
    surfaceVariant = DarkWhiteV1,
    surfaceDim = DarkWhiteV2,
    surfaceContainer = WhiteV2,
    surfaceContainerLow = DarkWhiteV2,
    surfaceContainerHigh = WhiteV1,
    outline = White,
    background = DarkWhite,
    error = Red,

    onPrimary = Black,
    onSecondary = Black,
    onSurface = Black,
    onSurfaceVariant = Black,
    onBackground = Black,
    onError = Black,
)

@Composable
fun PancodeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}