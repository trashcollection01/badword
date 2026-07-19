package net.joohnserde.badword.core.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = BluegreyV1,
    onPrimary = White,

    secondary = Greenteal,
    onSecondary = White,

    background = Darkgrey,
    onBackground = White,

    surface = Darkgrey,
    onSurface = White,
    surfaceVariant = DarkgreyV1,
    onSurfaceVariant = White,
    surfaceDim = DarkgreyV2,

    surfaceContainer = Darkgrey,
    surfaceContainerLow = DarkgreyV1,
//    surfaceContainerHigh = Darkgrey,

    outline = Grey,
    outlineVariant = DarkgreyV2,

    error = Red,
    onError = White,
)

private val LightColorScheme = lightColorScheme(
    primary = Bluegrey,
    onPrimary = White,

    secondary = Greenteal,
    onSecondary = Black,

    background = White,
    onBackground = Black,

    surface = White,
    onSurface = Black,
    surfaceVariant = WhiteV1,
    onSurfaceVariant = Black,
    surfaceDim = WhiteV2,

    surfaceContainer = White,
    surfaceContainerLow = WhiteV1,
//    surfaceContainerHigh = White,

    outline = Darkwhite,
    outlineVariant = Darkwhite,

    error = Red,
    onError = White,

)

@Composable
fun BadwordTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
//    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}