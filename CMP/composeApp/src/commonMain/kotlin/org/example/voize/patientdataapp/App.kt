package org.example.voize.patientdataapp

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.patientdataapp.ui.theme.PatientDataAppTheme
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PatientDataAppTheme {
        Scaffold(
            modifier = Modifier.fillMaxSize()
        ) { padding ->
//            Navigation(
//                repository = PatientRepository(
//                    apiService = MockPatientApiService(
//                        data = data,
//                        delayTime = simulateNetworkDelayInMs
//                    )
//                ),
//                modifier = Modifier
//                    .padding(padding)
//            )
            Text("Hello World!")
        }
    }
}
