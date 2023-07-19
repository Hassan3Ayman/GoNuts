package com.example.gonuts.ui.screens.welcome

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.gonuts.ui.navigation.GonutDestination

fun NavGraphBuilder.boardingRoute(navHostController: NavHostController){
    composable(GonutDestination.Boarding.route){ WelcomeScreen(navHostController)}
}