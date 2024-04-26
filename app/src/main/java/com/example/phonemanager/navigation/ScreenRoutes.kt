package com.example.phonemanager.navigation

import androidx.navigation.NavController
import com.example.phonemanager.utils.Action
import com.example.phonemanager.utils.Constants.LIST_SCREEN
import com.example.phonemanager.utils.Constants.SPLASH_SCREEN

class ScreenRoutes(navController: NavController) {
    val fromContactToList: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }

    val fromListToContact: (Int) -> Unit = { noteId ->
        navController.navigate(route = "note/$noteId")
    }

    val fromSplashToList: () -> Unit = {
        navController.navigate(route = "list/${Action.NO_ACTION.name}") {
            popUpTo(SPLASH_SCREEN) { inclusive = true }
        }
    }
}