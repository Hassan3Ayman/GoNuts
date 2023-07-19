package com.example.gonuts.ui.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.gonuts.ui.composables.BottomNavBar
import com.example.gonuts.ui.navigation.GonutNavGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GonutApp() {
    val navController = rememberNavController()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = { BottomNavBar(navController) }
    ) {
        GonutNavGraph(navHostController = navController, modifier = Modifier.padding(it))
    }
}
