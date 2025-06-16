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
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.CareReportsCellViewModel
import com.example.patientdataapp.ui.viewmodel.PatientDetailViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientDetailScreen(viewModel: PatientDetailViewModel) {
        Column {
            TopAppBar(
                title = {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = viewModel.screenTitle,
                            style = MaterialTheme.typography.titleLarge
                        )
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .background(MaterialTheme.colorScheme.primary)
            )
            when {
                viewModel.isLoading -> LoadingView()
                viewModel.errorOccurred -> ErrorView(viewModel.errorText)
                else -> CareReportView(viewModel.careReportsCellViewModel)
            }
        }
}

@Composable
private fun CareReportView(careReports: List<CareReportsCellViewModel>) {
    LazyColumn(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        items(careReports) {
            CareReportCellView(it)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PatientDetailScreenPreview() {
    val viewModel = PatientDetailViewModel(
        viewTitle = "Test",
        patientID = "b270b476-e2c2-11ec-8fea-0242ac120002",
        repository = PatientRepository(apiService = MockPatientApiService(data))
    )
    PatientDetailScreen(viewModel)
}