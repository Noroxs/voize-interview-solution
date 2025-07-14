package com.example.patientdataapp.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patientdataapp.repository.PatientRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class PatientListViewModel(
    private val repository: PatientRepository,
) : ViewModel() {

    var patientListCellViewModels by mutableStateOf(emptyList<PatientListCellViewModel>())
        private set

    var isLoading by mutableStateOf(true)
        private set

    var errorOccurred by mutableStateOf(false)
        private set

    init {
        loadPatients()
    }

    val screenTitle = "Patientenliste"
    val errorText = "Daten konnten nicht geladen werden"

    private fun loadPatients() {
        viewModelScope.launch {
            repository.getPatients()
                .catch { exception ->
                    Log.e("Loading Patients", "Load patients failed: $exception");
                    errorOccurred = true
                    isLoading = false
                }
                .collect { patients ->
                    isLoading = false
                    patientListCellViewModels = patients
                        .sortedBy { it.lastName + it.firstName }
                        .map { patient ->
                            PatientListCellViewModel(patient)
                        }
                }
        }
    }
}

