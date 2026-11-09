package com.iptv.heropro.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val DarkColors = darkColorScheme(
    primary = MarvelRed,
    secondary = DcBlue,
    tertiary = MarvelYellow,
    background = Ink,
    surface = Panel,
    onPrimary = Paper,
    onSecondary = Paper,
    onBackground = TextPrimary,
    onSurface = TextPrimary
)

@Composable
fun IptvHeroProTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = DarkColors, typography = Typography, content = content)
}
