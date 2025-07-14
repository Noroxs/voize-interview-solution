package org.example.voize.patientdataapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.patientdataapp.data.data
import org.example.voize.patientdataapp.navigation.Navigation
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.theme.PatientDataAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun App(simulateNetworkDelayInMs: Long = 1000L) {
    val patientData = data

    PatientDataAppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { padding ->
            Navigation(
                repository = PatientRepository(
                    apiService = MockPatientApiService(
                        data = patientData,
                        delayTime = simulateNetworkDelayInMs
                    )
                ),
                modifier = Modifier.padding(padding)
            )
        }
    }
}

@Preview()
@Composable
fun CareReportCategoriesViewPreview() {
    App(simulateNetworkDelayInMs = 0L)
}
