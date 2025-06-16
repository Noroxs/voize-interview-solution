package com.example.patientdataapp.network.api

import com.example.patientdataapp.datamodel.Patient
import kotlinx.coroutines.delay

class MockPatientApiService(
    private val data: List<Patient>
) : PatientApiService {

    override suspend fun getPatients(): List<Patient> {
        delay(1000)
        //throw RuntimeException("Something went wrong")

        return data
    }

    override suspend fun getPatientById(id: String): Patient? {
        delay(1000)
        //throw RuntimeException("Something went wrong")

        return data.find { it.id == id }
    }
}