package com.example.patientdataapp

import com.example.patientdataapp.helper.DataFactory
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.test.runTest
import org.junit.Assert.assertEquals
import org.junit.Test

class PatientRepositoryTest {

    @Test
    fun patientRepository_getPatients_successfully() = runTest {
        val expectedData = DataFactory().getPatients(5)
        val mockApiService = MockPatientApiService(expectedData)

        val repo = PatientRepository(mockApiService)

        repo.getPatients().collect {
            assertEquals(expectedData, it)
        }
    }

    @Test
    fun patientRepository_getPatients_exception() = runTest {
        val expectedData = RuntimeException("Test did fail successfully")
        val mockApiService = MockPatientApiService(
            data = DataFactory().getPatients(1),
            exception = expectedData
        )

        val repo = PatientRepository(mockApiService)
        repo.getPatients()
            .catch {
                assertEquals(expectedData, it)
            }
            .collect {
                assert(false)
        }
    }

    @Test
    fun patientRepository_getPatientByID_successfully() = runTest {
        val expectedData = DataFactory().getPatients(5)
        val mockApiService = MockPatientApiService(data = DataFactory().getPatients(5))

        val repo = PatientRepository(mockApiService)

        repo.getPatientById("5").collect { patient ->
            assertEquals(expectedData.first { it.id == "5" }, patient)
        }
    }

    @Test
    fun patientRepository_getPatientByID_exception() = runTest {
        val expectedData = RuntimeException("Test did fail successfully")
        val mockApiService = MockPatientApiService(
            data = DataFactory().getPatients(1),
            exception = expectedData
        )

        val repo = PatientRepository(mockApiService)
        repo.getPatientById("1")
            .catch {
                assertEquals(expectedData, it)
            }
            .collect {
                assert(false)
            }
    }

}