package com.example.navigationdemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.navigationdemo.ui.navigation.BottomBar
import com.example.navigationdemo.ui.navigation.NavigationHost
import com.example.navigationdemo.ui.navigation.Topbar
import com.example.navigationdemo.ui.theme.NavigationDemoTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationDemoTheme {

                RootPage()
            }
        }
    }
}

@Composable
fun RootPage(){
    val navController=rememberNavController()
    Scaffold(modifier = Modifier.fillMaxSize(),
        { Topbar() },
        {
            BottomBar(navController=navController)
        },
    ) { innerPadding ->

        Column(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
            .background(Color(0xFFF4F5F5))
        ){
            NavigationHost(navController=navController)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    NavigationDemoTheme {
    }
}