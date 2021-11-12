package uz.suhrob.campingapp.presentation.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val LightColorPalette = lightColors(
    primary = Green500,
    primaryVariant = Gray900,
    secondary = LightGreen300
)

@Composable
fun CampingAppTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable() () -> Unit) {
    MaterialTheme(
        colors = LightColorPalette,
        typography = SFProTypography,
        shapes = Shapes,
        content = content
    )
}