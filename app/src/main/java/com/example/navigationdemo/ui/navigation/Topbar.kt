package com.example.navigationdemo.ui.navigation

import android.provider.CalendarContract
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Topbar() {
    TopAppBar(
        title = {Text("Navi demo")},
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color(0xFF6200EE),
            titleContentColor = Color.White
        )

    )
}