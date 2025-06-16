package com.example.patientdataapp.ui.viewmodel

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patientdataapp.repository.PatientRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.launch

class PatientDetailViewModel(
    private val viewTitle: String?,
    private val patientID: String?,
    private val repository: PatientRepository
) : ViewModel() {

    var careReportsCellViewModel by mutableStateOf(emptyList<CareReportsCellViewModel>())
        private set

    var isLoading by mutableStateOf(true)
        private set

    var errorOccurred by mutableStateOf(false)
        private set

    var screenTitle by mutableStateOf(viewTitle ?: "Patient")
        private set

    init {
        loadPatientData()
    }

    val errorText = "Daten konnten nicht geladen werden"

    private fun loadPatientData() {
        viewModelScope.launch {
            patientID?.let {
                repository.getPatientById(patientID)
                    .catch { exception ->
                        Log.e("Loading Patient", "Load patient ($patientID) failed: $exception");
                        isLoading = false
                        errorOccurred = true
                    }
                    .collect { patient ->
                        isLoading = false

                        patient?.let {
                            screenTitle = it.fullName
                            careReportsCellViewModel = it.careReports.map { careReport ->
                                CareReportsCellViewModel(careReport)
                            }
                        } ?: run {
                            errorOccurred = true
                        }
                    }
            } ?: run {
                isLoading = false
                errorOccurred = true
            }
        }
    }

}