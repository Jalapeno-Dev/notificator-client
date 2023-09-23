package com.jalapeno.jalapenonotificator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jalapeno.jalapenonotificator.ui.theme.JalapenoNotificatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JalapenoNotificatorTheme {

            }
        }
    }
}
