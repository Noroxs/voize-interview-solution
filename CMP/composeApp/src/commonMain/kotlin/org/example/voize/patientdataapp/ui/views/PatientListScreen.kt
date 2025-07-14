package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.composables.PersonIcon
import com.example.patientdataapp.data.data
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel
import com.example.patientdataapp.ui.viewmodel.PatientListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientListScreen(
    viewModel: PatientListViewModel,
    onPatientClick: (patientId: String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.secondary)
    ) {
        TopAppBar(
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(PersonIcon, contentDescription = "Patients")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text(viewModel.screenTitle, style = MaterialTheme.typography.titleLarge)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .background(MaterialTheme.colorScheme.primary)
        )
        when {
            viewModel.isLoading -> LoadingView()
            viewModel.errorOccurred -> ErrorView(viewModel.errorText)
            else -> PatientList(
                patients = viewModel.patientListCellViewModels,
                onPatientClick = onPatientClick
            )
        }
    }
}

@Composable
private fun PatientList(
    patients: List<PatientListCellViewModel>,
    onPatientClick: (patientId: String) -> Unit
) {
    LazyColumn(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        items(patients) {
            PatientListCellView(
                cellViewModel = it,
                onPatientClick = onPatientClick
            )
        }
    }
}

@Preview()
@Composable
fun PatientListScreenPreview() {
    val viewModel = PatientListViewModel(
        repository = PatientRepository(apiService = MockPatientApiService(data))
    )
    PatientListScreen(viewModel) {}
}