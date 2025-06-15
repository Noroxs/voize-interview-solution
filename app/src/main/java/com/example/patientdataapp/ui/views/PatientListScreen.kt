package com.example.patientdataapp.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.patientdataapp.data.data
import com.example.patientdataapp.navigation.Screen
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel

@Composable
fun PatientDetailScreen(navController: NavController, repository: PatientRepository, patientID: String?) {
    Text(patientID ?: "oops")
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PatientListScreen(navController: NavController, repository: PatientRepository) {
    val data = data
    Column {
        TopAppBar(
            title = {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(Icons.Default.Person, contentDescription = "Patients")
                    Spacer(modifier = Modifier.width(8.dp))
                    Text("Patientenliste", style = MaterialTheme.typography.titleLarge)
                }
            },
            modifier = Modifier
                .fillMaxWidth()
        )
        LazyColumn(
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            items(data) { patient ->
                val cell = PatientListCellViewModel(patient) { patientID ->
                    navController.navigate(Screen.DetailScreen.withArgs(patientID))
                }
                PatientListCellView(cell)
            }
        }
    }
}


