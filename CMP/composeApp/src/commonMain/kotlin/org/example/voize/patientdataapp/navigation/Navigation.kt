package org.example.voize.patientdataapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import kotlin.reflect.KClass
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
                    factory = PatientListViewModelFactory(repository)
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
                route = Screen.DetailScreen.route + "/{patientID}",
                arguments = listOf(
                    navArgument(name = "patientID") {
                        type = NavType.StringType
                    }
                )
            ) { entry ->
                val patientID = entry.savedStateHandle.get<String>("patientID")

                val viewModel = viewModel<PatientDetailViewModel>(
                        key = "DetailViewModel_${patientID}",
                        factory = PatientDetailViewModelFactory(patientID, repository)
                )
                PatientDetailScreen(viewModel)
            }
        }
    }
}

class PatientListViewModelFactory(
    private val repository: PatientRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: KClass<T>, extras: CreationExtras): T {
        @Suppress("UNCHECKED_CAST")
        return PatientListViewModel(repository = repository) as T
    }
}

class PatientDetailViewModelFactory(
    private val patientID: String?,
    private val repository: PatientRepository
) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: KClass<T>, extras: CreationExtras): T {
        @Suppress("UNCHECKED_CAST")
        return PatientDetailViewModel(
            patientID = patientID,
            repository = repository
        ) as T
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