package mn.loreverse.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val LoreverseColors = darkColorScheme(
    primary = Purple,
    secondary = Violet,
    tertiary = Teal,
    background = Void,
    surface = Panel,
    surfaceVariant = PanelRaised,
    onPrimary = TextMain,
    onSecondary = TextMain,
    onBackground = TextMain,
    onSurface = TextMain,
    onSurfaceVariant = TextMuted,
    error = Error
)

@Composable
fun LoreverseTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = LoreverseColors,
        typography = MaterialTheme.typography,
        content = content
    )
}
