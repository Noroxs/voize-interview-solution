package com.example.patientdataapp

import com.example.patientdataapp.datamodel.Patient
import com.example.patientdataapp.helper.DataFactory
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel
import kotlinx.datetime.LocalDate
import org.junit.Test
import org.junit.Assert.*

class PatientListCellViewModelTest {
    private val patient = Patient(
        id = "id",
        salutation = "salutation",
        firstName = "firstName",
        lastName = "lastName",
        birthday = LocalDate.parse("1988-08-17"),
        careReports = DataFactory().getCareReports(amount = 5)
    )

    @Test
    fun patientCellViewModel_fullName_isCorrect() {
        val viewModel = PatientListCellViewModel(patient)
        assertEquals("salutation firstName lastName", viewModel.fullName)
    }

    @Test
    fun patientCellViewModel_birthdate_isCorrect() {
        val viewModel = PatientListCellViewModel(patient)
        assertEquals("Geburtstag: 17.08.1988", viewModel.birthdate)
    }

    @Test
    fun patientCellViewModel_reportsCount_isCorrect() {
        val viewModel = PatientListCellViewModel(patient)
        assertEquals("Reports: 5", viewModel.reportsCount)
    }

    @Test
    fun patientCellViewModel_cellClickedCall_isCorrect() {
        val expectedData = "id"

        val viewModel = PatientListCellViewModel(patient)

        assertEquals(expectedData, viewModel.cellWasClicked())
    }
}