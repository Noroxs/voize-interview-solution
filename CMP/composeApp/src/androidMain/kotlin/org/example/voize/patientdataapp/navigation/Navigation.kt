package com.example.patientdataapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientDetailViewModel
import com.example.patientdataapp.ui.viewmodel.PatientListViewModel
import com.example.patientdataapp.ui.views.PatientDetailScreen
import com.example.patientdataapp.ui.views.PatientListScreen

@Composable
fun Navigation(repository: PatientRepository, modifier: Modifier = Modifier) {
    val navController = rememberNavController()

    Box(modifier = modifier) {
        NavHost(navController = navController, startDestination = Screen.RootScreen.route) {
            composable(Screen.RootScreen.route) {
                val viewModel = viewModel<PatientListViewModel>(
                    factory = object : ViewModelProvider.Factory {
                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                            return PatientListViewModel(
                                repository = repository,
                            ) as T
                        }
                    }
                )
                PatientListScreen(viewModel,
                    onPatientClick = {
                        navController.navigate(
                            Screen.DetailScreen.withArgs(it)
                        )
                    }
                )
            }
            composable(
                Screen.DetailScreen.route + "/{patientID}",
                arguments = listOf(
                    navArgument(name = "patientID") {
                        type = NavType.StringType
                    }
                )
            ) { entry ->
                val patientID = entry.arguments?.getString("patientID")

                val viewModel = viewModel<PatientDetailViewModel>(
                    key = "DetailViewModel_${patientID}",
                    factory = object : ViewModelProvider.Factory {
                        override fun <T : ViewModel> create(modelClass: Class<T>): T {
                            return PatientDetailViewModel(
                                patientID = patientID,
                                repository = repository,
                            ) as T
                        }
                    }
                )

                PatientDetailScreen(viewModel)
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