package com.example.patientdataapp.ui.views

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.patientdataapp.data.data
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel

@Composable
fun PatientDetailScreen(navController: NavController, repository: PatientRepository, patientID: String?) {
    Text(patientID ?: "oops")
}

@Preview(showBackground = true)
@Composable
fun PatientDetailScreenPreview() {
    val navController = rememberNavController()
    val repository = PatientRepository(apiService = MockPatientApiService(data))
    PatientDetailScreen(
        navController = navController,
        repository = repository,
        patientID = "b270b476-e2c2-11ec-8fea-0242ac120002"
    )
}