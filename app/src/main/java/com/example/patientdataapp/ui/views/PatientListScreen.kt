package com.example.patientdataapp.ui.views

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.patientdataapp.data.data
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel

@Composable
fun PatientListScreen(navController: NavController) {
    val data = data

    LazyColumn(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxWidth()
    ) {
        items(data) {
            val cell = PatientListCellViewModel(it)
            PatientListCellView(cell)
        }
    }
}
