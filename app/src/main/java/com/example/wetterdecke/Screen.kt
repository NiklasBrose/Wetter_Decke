package com.example.wetterdecke

sealed class Screen (val route: String){
    object TempListScreen : Screen("templist_screen")
    object HomeScreen : Screen("home_screen")
    object SettingsScreen : Screen("settings_screen")
}