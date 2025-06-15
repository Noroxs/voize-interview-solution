package com.example.patientdataapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavArgs
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.views.PatientDetailScreen
import com.example.patientdataapp.ui.views.PatientListScreen

@Composable
fun Navigation(repository: PatientRepository, modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    Box(modifier = modifier) {
        NavHost(navController = navController, startDestination = Screen.RootScreen.route) {
            composable(Screen.RootScreen.route) {
                PatientListScreen(navController, repository)
            }
            composable(
                Screen.DetailScreen.route + "/{patientID}",
                arguments = listOf(
                    navArgument(name = "patientID") {
                        type = NavType.StringType
                    }
                )
            ) { entry ->
                PatientDetailScreen(
                    navController = navController,
                    repository = repository,
                    patientID = entry.arguments?.getString("patientID"))
            }
        }
    }
}


sealed class Screen(val route: String) {
    data object RootScreen : Screen("patient_list_screen")
    data object DetailScreen : Screen("patient_detail_screen")

    fun withArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEach { arg ->
                append("/$arg")
            }
        }
    }
}