package com.jalapeno.jalapenonotificator.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.NavDestination
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navOptions
import com.jalapeno.chat.navigation.navigateToChat
import com.jalapeno.jalapenonotificator.navigation.TopLevelDestination
import com.jalapeno.jalapenonotificator.navigation.TopLevelDestination.CHAT
import kotlinx.coroutines.CoroutineScope


@Composable
fun rememberNtrAppState(
    navController: NavHostController = rememberNavController(),
    coroutineScope: CoroutineScope = rememberCoroutineScope()
) : NtrAppState {
    return remember(
        navController,
        coroutineScope
    ) {
        NtrAppState(
            navController,
            coroutineScope
        )
    }
}

@Stable
class NtrAppState(
    val navController: NavHostController,
    val coroutineScope: CoroutineScope
) {
    val currentDestination: NavDestination?
        @Composable get() = navController
            .currentBackStackEntryAsState().value?.destination

    val topLevelDestinations: List<TopLevelDestination> = TopLevelDestination.values().asList()

    fun navigateToTopLevelDestination(topLevelDestination: TopLevelDestination) {
        val topLevelNavOptions = navOptions {
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = true
            }
            launchSingleTop = true
        }
        when (topLevelDestination) {
            CHAT -> navController.navigateToChat(topLevelNavOptions)
        }
    }
}