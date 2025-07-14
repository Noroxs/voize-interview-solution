package com.example.patientdataapp

import com.example.patientdataapp.helper.DataFactory
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientDetailViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class PatientDetailViewModelTest {

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun patientDetailViewModel_loadData_successfully() = runTest {
        Dispatchers.setMain(UnconfinedTestDispatcher())

        try {
            val careReports = DataFactory().getCareReports(5)
            val mockPatients = DataFactory().getPatients(3, careReports = careReports)
            val mockAPIClient = MockPatientApiService(mockPatients)
            val repository = PatientRepository(mockAPIClient)

            val viewModel = PatientDetailViewModel(patientID = "2", repository = repository)

            assertFalse("Should not be loading", viewModel.isLoading)
            assertFalse("Should not show error", viewModel.errorOccurred)
            assertEquals("Should have correct screenTitle", "Frau firstName 2 lastName 2", viewModel.screenTitle)
            assertEquals("Should have correct careReports count", 5, viewModel.careReportsCellViewModel.size)

        } finally {
            Dispatchers.resetMain()
        }
    }

}
