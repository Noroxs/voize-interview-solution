package com.example.patientdataapp.network.api

import com.example.patientdataapp.datamodel.Patient

interface PatientApiService {
    suspend fun getPatients(): List<Patient>
    suspend fun getPatientById(id: String): Patient?
}