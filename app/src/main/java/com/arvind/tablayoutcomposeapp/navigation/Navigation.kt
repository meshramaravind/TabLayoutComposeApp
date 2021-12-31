package com.arvind.tablayoutcomposeapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.arvind.tablayoutcomposeapp.view.SplashScreen
import com.arvind.tablayoutcomposeapp.view.TabHome
import com.google.accompanist.pager.ExperimentalPagerApi

@ExperimentalPagerApi
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Screens.SplashScreen.route
    ) {
        composable(Screens.SplashScreen.route) {
            SplashScreen(navController = navController)
        }

        composable(Screens.HomeScreen.route) {
            TabHome()
        }


    }
}