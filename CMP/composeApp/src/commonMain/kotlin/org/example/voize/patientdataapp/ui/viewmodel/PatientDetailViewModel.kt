package com.example.patientdataapp.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.patientdataapp.repository.PatientRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class PatientDetailViewModel(
    private val patientID: String?,
    private val repository: PatientRepository
) : ViewModel() {

    var careReportsCellViewModel by mutableStateOf(emptyList<CareReportsCellViewModel>())
        private set

    var isLoading by mutableStateOf(true)
        private set

    var errorOccurred by mutableStateOf(false)
        private set

    var screenTitle by mutableStateOf("Lade Patienten Daten")
        private set

    init {
        loadPatientData()
    }

    val errorText = "Daten konnten nicht geladen werden"

    private fun loadPatientData() {
        viewModelScope.launch {
            patientID?.let {
                repository.getPatientById(patientID)
                    .catch {
                        isLoading = false
                        errorOccurred = true
                    }
                    .collect {
                        isLoading = false

                        it?.let { patient ->
                            screenTitle = patient.fullName
                            careReportsCellViewModel = patient.careReports
                                .sortedBy { careReport->
                                    careReport.createdAt
                                }
                                .map { careReport ->
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