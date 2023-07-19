package com.example.gonuts.ui.navigation


sealed class GonutDestination(
 val route: String
){
    object Home: GonutDestination( "home")
    object Details: GonutDestination( route = "details")
    object Boarding: GonutDestination( route = "boarding")
}
