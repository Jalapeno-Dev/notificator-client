package com.jalapeno.jalapenonotificator.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.jalapeno.designsystem.icon.NtrIcons
import com.jalapeno.feature.chat.R as chatR

enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
) {
    CHAT(
        selectedIcon = NtrIcons.Chat,
        unselectedIcon = NtrIcons.Chat,
        iconTextId = chatR.string.chat
    ),
}