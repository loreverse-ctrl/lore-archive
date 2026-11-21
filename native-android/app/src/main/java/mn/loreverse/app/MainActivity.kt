package mn.loreverse.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import mn.loreverse.app.ui.LoreverseApp
import mn.loreverse.app.ui.theme.LoreverseTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LoreverseTheme {
                LoreverseApp()
            }
        }
    }
}
