package com.example.gonuts.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import com.example.gonuts.ui.screens.details.detailsRoute
import com.example.gonuts.ui.screens.home.homeRoute
import com.example.gonuts.ui.screens.welcome.boardingRoute

@Composable
fun GonutNavGraph(navHostController: NavHostController, modifier: Modifier) {
    NavHost(navController = navHostController,
        modifier = modifier,
        startDestination = GonutDestination.Boarding.route
    ) {
        boardingRoute(navHostController)
        homeRoute(navHostController)
        detailsRoute(navHostController)
    }
}