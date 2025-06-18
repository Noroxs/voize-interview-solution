package com.example.patientdataapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.patientdataapp.data.data
import com.example.patientdataapp.navigation.Navigation
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.theme.PatientDataAppTheme

class MainActivity : ComponentActivity() {
    private val simulateNetworkDelayInMs = 1000L
    private val patientData = data

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
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
                        modifier = Modifier
                            .padding(padding)
                    )
                }
            }
        }
    }
}