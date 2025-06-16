package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.patientdataapp.data.data
import com.example.patientdataapp.datamodel.Patient
import com.example.patientdataapp.ui.viewmodel.CareReportsCellViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
//fun PatientDetailScreen(navController: NavController, repository: PatientRepository, patientID: String?) {
fun PatientDetailScreen(patient: Patient?) {
    patient?.let {
        Column {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(it.fullName, style = MaterialTheme.typography.titleLarge)
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            )
            LazyColumn(
                verticalArrangement = Arrangement.Top,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .background(MaterialTheme.colorScheme.secondary)
            ) {
                items(it.careReports.sortedBy { it.createdAt }) {
                    CareReportCellView(CareReportsCellViewModel(it))
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PatientDetailScreenPreview() {
    PatientDetailScreen(data.first())
//    val navController = rememberNavController()
//    val repository = PatientRepository(apiService = MockPatientApiService(data))
//    PatientDetailScreen(
//        navController = navController,
//        repository = repository,
//        patientID = "b270b476-e2c2-11ec-8fea-0242ac120002"
//    )
}