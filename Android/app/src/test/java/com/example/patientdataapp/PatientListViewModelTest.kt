package com.example.patientdataapp

import com.example.patientdataapp.helper.DataFactory
import com.example.patientdataapp.network.api.MockPatientApiService
import com.example.patientdataapp.repository.PatientRepository
import com.example.patientdataapp.ui.viewmodel.PatientListViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.UnconfinedTestDispatcher
import kotlinx.coroutines.test.resetMain
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.test.setMain
import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Test

class PatientListViewModelTest {

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun patientListViewModel_loadData_successfully() = runTest {
        Dispatchers.setMain(UnconfinedTestDispatcher())

        try {
            val mockAPIClient = MockPatientApiService(DataFactory().getPatients(5))
            val repository = PatientRepository(mockAPIClient)

            val viewModel = PatientListViewModel(repository)

            assertFalse("Should not be loading", viewModel.isLoading)
            assertFalse("Should not show error", viewModel.errorOccurred)
            assertEquals("Should have correct number of view models", 5, viewModel.patientListCellViewModels.size)

        } finally {
            Dispatchers.resetMain()
        }
    }

}
