package com.arvind.tablayoutcomposeapp.navigation

import android.annotation.SuppressLint

sealed class Screens(val route: String) {
    @SuppressLint("CustomSplashScreen")
    object SplashScreen : Screens("splash_screen")
    object HomeScreen : Screens("home_screen")
}
