package com.example.patientdataapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.patientdataapp.ui.views.PatientListScreen

@Composable
fun Navigation(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Box(modifier = modifier) {
        NavHost(navController = navController, startDestination = Screen.RootScreen.route) {
            composable(Screen.RootScreen.route) {
                PatientListScreen(navController)
            }
        }
    }
}


sealed class Screen(val route: String) {
    data object RootScreen : Screen("patient_list_screen")
    data object DetailScreen : Screen("patient_detail_screen")
}