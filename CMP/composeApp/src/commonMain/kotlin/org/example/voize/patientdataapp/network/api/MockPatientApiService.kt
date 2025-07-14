package com.example.patientdataapp.network.api

import com.example.patientdataapp.datamodel.Patient
import kotlinx.coroutines.delay
import java.lang.Exception

class MockPatientApiService(
    private val data: List<Patient>,
    private val delayTime: Long = 0,
    private val exception: Exception? = null
) : PatientApiService {

    override suspend fun getPatients(): List<Patient> {
        delay(delayTime)

        exception?.let {
            throw exception
        }

        return data
    }

    override suspend fun getPatientById(id: String): Patient? {
        delay(delayTime)

        exception?.let {
            throw exception
        }

        return data.find { it.id == id }
    }
}