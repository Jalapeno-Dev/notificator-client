package com.jalapeno.chat.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.jalapeno.chat.ChatListRoute

const val chatGraphRoute = "chat_graph"
const val chatNavigationRoute = "chat_route"
const val chatListNavigationRoute = "chat_list_route"

fun NavController.navigateToChat(navOptions: NavOptions? = null) {
    this.navigate(chatGraphRoute, navOptions)
}

fun NavGraphBuilder.chatGraph() {
    navigation(
        route = chatGraphRoute,
        startDestination = chatListNavigationRoute,
    ) {
        chatListScreen()
    }
}

fun NavGraphBuilder.chatListScreen() {
    composable(
        route = chatListNavigationRoute,
    ) {
        ChatListRoute()
    }
}