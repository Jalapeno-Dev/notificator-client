package com.jalapeno.jalapenonotificator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import com.jalapeno.designsystem.theme.JalapenoNotificatorTheme
import com.jalapeno.jalapenonotificator.ui.NtrApp
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        val viewModel: MainActivityViewModel by viewModels()

        super.onCreate(savedInstanceState)
        setContent {
            JalapenoNotificatorTheme {
                NtrApp()
            }
        }
    }
}
