package com.example.navigationdemo.ui.navigation

import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.magnifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState

sealed class BottomNavItem(val route:String,val icon : ImageVector, val label:String){
    object Home: BottomNavItem("home", Icons.Default.Home,"Home")
    object Explore: BottomNavItem("Explore", Icons.Default.Share,"Explore")
}
@Composable
fun BottomBar(navController: NavController) {
    val bottomItems=listOf(
        BottomNavItem.Home,
        BottomNavItem.Explore
    )

    val currentBackStack by navController.currentBackStackEntryAsState()
    val currentRoute=currentBackStack?.destination?.route

    NavigationBar {
        bottomItems.forEach { item ->
           val selected = currentRoute==item.route
            NavigationBarItem(
                icon = {
                    Icon(item.icon,
                    contentDescription = item.label,
                        Modifier.size(24.dp)
                    )
                },
                label = {Text(item.label)},
                selected=selected,
                onClick = {
                    navController.navigate(item.route)
                },
                colors= NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(0xFF6200ee),
                    Color(0xff6200EE),
                    Color(0xff6200EE).copy(alpha=0.1f),
                    Color.Gray,
                    Color.Gray
                )
            )
        }
    }
}