package com.example.patientdataapp.repository

import com.example.patientdataapp.datamodel.Patient
import com.example.patientdataapp.network.api.PatientApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PatientRepository(
    private val apiService: PatientApiService
) {
    fun getPatients(): Flow<List<Patient>> = flow {
        try {
            val patients = apiService.getPatients()
            emit(patients)
        } catch (e: Exception) {
            emit(emptyList())
        }
    }

    fun getPatientById(id: String): Flow<Patient?> = flow {
        try {
            val patient = apiService.getPatientById(id)
            emit(patient)
        } catch (e: Exception) {
            emit(null)
        }
    }
}