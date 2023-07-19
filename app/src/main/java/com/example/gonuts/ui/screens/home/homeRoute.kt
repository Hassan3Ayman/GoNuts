package com.example.gonuts.ui.screens.home

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import com.example.gonuts.ui.navigation.GonutDestination

fun NavGraphBuilder.homeRoute(navHostController: NavHostController){
    composable(GonutDestination.Home.route){ HomeScreen(navHostController) }
}

fun NavController.navigateToHome(){
    navigate(GonutDestination.Home.route)
}