package com.example.patientdataapp.repository

import com.example.patientdataapp.datamodel.Patient
import com.example.patientdataapp.network.api.PatientApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class PatientRepository(
    private val apiService: PatientApiService
) {
    fun getPatients(): Flow<List<Patient>> = flow {
        val patients = apiService.getPatients()
        emit(patients)
    }

    fun getPatientById(id: String): Flow<Patient?> = flow {
        val patient = apiService.getPatientById(id)
        emit(patient)
    }
}