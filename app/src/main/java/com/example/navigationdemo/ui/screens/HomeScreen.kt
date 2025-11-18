package com.example.navigationdemo.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        Text("Home")
        Button({ navController.navigate("explore") }) {
            Text("Go to Explore")
        }
    }
}