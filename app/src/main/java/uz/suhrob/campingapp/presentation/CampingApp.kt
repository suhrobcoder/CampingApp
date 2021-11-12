package uz.suhrob.campingapp.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.insets.ProvideWindowInsets
import uz.suhrob.campingapp.presentation.theme.CampingAppTheme

@Composable
fun CampingApp() {
    ProvideWindowInsets {
        CampingAppTheme {
            Surface(color = MaterialTheme.colors.background, modifier = Modifier.fillMaxSize()) {
                Text("Camping App")
            }
        }
    }
}