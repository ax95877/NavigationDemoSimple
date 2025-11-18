package com.example.navigationdemo.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationdemo.ui.screens.ExploreScreen
import com.example.navigationdemo.ui.screens.HomeScreen
import java.lang.reflect.Modifier

@Composable
fun NavigationHost(navController: NavHostController) {
    NavHost(
        navController=navController,
        startDestination = "home",
    ){
        composable("home") { HomeScreen(navController) }
        composable("explore") { ExploreScreen(navController) }
    }

}