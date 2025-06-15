package com.example.patientdataapp.network.api

import com.example.patientdataapp.datamodel.Patient

class MockPatientApiService(
    private val data: List<Patient>
) : PatientApiService {

    override suspend fun getPatients(): List<Patient> = data

    override suspend fun getPatientById(id: String): Patient? = data.find { it.id == id }
}