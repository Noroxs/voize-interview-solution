package com.example.patientdataapp.helper

import com.example.patientdataapp.datamodel.CareReport
import com.example.patientdataapp.datamodel.Patient
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.LocalDateTime

class DataFactory {

    fun getPatients(amount: Int): List<Patient> {
        if (amount <= 0) {
            return emptyList()
        }
        return (1..amount).map {
            Patient(id = it.toString(),
                salutation = "Frau",
                firstName = "firstName $it",
                lastName = "lastName $it",
                birthday = LocalDate.parse("1970-01-01"),
                careReports = emptyList()
            )
        }
    }

    fun getCareReports(amount: Int): List<CareReport> {
        if (amount <= 0) {
            return emptyList()
        }
        return (1..amount).map {
            CareReport(
                id = it.toString(),
                createdAt = Instant.parse("2025-01-01T12:00:00.000Z"),
                createdBy = "createdBy $it",
                text = "text $it",
                categories = listOf(it.toString())
            )
        }
    }

}