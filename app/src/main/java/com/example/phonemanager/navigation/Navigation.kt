package com.example.phonemanager.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import com.example.phonemanager.ui.home.HomeViewModel
import com.example.phonemanager.utils.Constants.LIST_SCREEN

@Composable
fun SetupNavigation(navController: NavController, shareViewModel: HomeViewModel) {
    val screenRoutes = remember(navController) {
        ScreenRoutes(navController = navController)
    }
}