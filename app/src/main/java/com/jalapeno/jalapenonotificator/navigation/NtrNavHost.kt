package com.jalapeno.jalapenonotificator.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.jalapeno.chat.navigation.chatGraph
import com.jalapeno.chat.navigation.chatGraphRoute
import com.jalapeno.chat.navigation.chatListScreen
import com.jalapeno.chat.navigation.chatNavigationRoute
import com.jalapeno.jalapenonotificator.ui.NtrAppState

@Composable
fun NtrNavHost(
    appState: NtrAppState,
    modifier: Modifier = Modifier,
    startDestination: String = chatGraphRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        chatGraph()
    }
}
