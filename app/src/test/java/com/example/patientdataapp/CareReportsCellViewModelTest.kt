package com.example.patientdataapp

import com.example.patientdataapp.datamodel.CareReport
import com.example.patientdataapp.datamodel.CategoryType
import com.example.patientdataapp.ui.viewmodel.CareReportsCellViewModel
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import org.junit.Test
import org.junit.Assert.*

class CareReportsCellViewModelTest {
    private val testCareReport = CareReport(
        id = "careReportID",
        createdAt = Instant.parse("2025-01-01T12:00:00.000Z"),
        createdBy = "createdBy test",
        text = "text test",
        categories = listOf("Gesundheit", "Unbekannt")
    )

    @Test
    fun careReportsCellViewModel_text_isCorrect() {
        val viewModel = CareReportsCellViewModel(testCareReport)

        assertEquals("text test", viewModel.text)
    }

    @Test
    fun careReportsCellViewModel_creationInformation_isCorrect() {
        val viewModel = CareReportsCellViewModel(testCareReport, timeZone = TimeZone.UTC)

        assertEquals("01.01.2025 12:00 von createdBy test", viewModel.creationInformation)
    }

    @Test
    fun careReportsCellViewModel_categoryTypes_areCorrect() {
        val viewModel = CareReportsCellViewModel(testCareReport)

        assertEquals(
            listOf(CategoryType("Gesundheit"), CategoryType("Unbekannt")),
            viewModel.categoryTypes
        )
    }
}