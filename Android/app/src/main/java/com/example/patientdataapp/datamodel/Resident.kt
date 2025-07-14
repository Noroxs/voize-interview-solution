package com.example.patientdataapp.datamodel

import kotlinx.datetime.LocalDate

data class Patient(
    val id: String,
    val salutation: String,
    val firstName: String,
    val lastName: String,
    val birthday: LocalDate,
    val careReports: List<CareReport>
) {
    val fullName = "$salutation $firstName $lastName"
}