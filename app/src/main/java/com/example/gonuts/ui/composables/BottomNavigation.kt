package com.example.gonuts.ui.composables

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.gonuts.R
import com.example.gonuts.ui.navigation.GonutDestination
import com.example.gonuts.ui.theme.Salmon

@Composable
fun BottomNavBar(navController: NavHostController) {
    val current = navController.currentBackStackEntryAsState()
    val selectedScreen = current.value?.destination?.route

    val icons = listOf(
        R.drawable.ic_home,
        R.drawable.ic_favourites,
        R.drawable.ic_notification,
        R.drawable.ic_buy,
        R.drawable.ic_profile
    )

    AnimatedVisibility(
        visible = selectedScreen == GonutDestination.Home.route,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(80.dp)
                .background(Color.Transparent)
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.SpaceEvenly,
            verticalAlignment = Alignment.CenterVertically
        ) {
            icons.forEach {
                Icon(
                    modifier = Modifier
                        .clip(CircleShape)
                        .clickable { }
                        .padding(8.dp),
                    painter = painterResource(id = it),
                    contentDescription = "",
                    tint = Salmon
                )
            }
        }
    }
}