package com.example.patientdataapp.ui.viewmodel

import com.example.patientdataapp.datamodel.Patient

class PatientListCellViewModel(
    private val patient: Patient
) {
    val fullName = patient.fullName
    val reportsCount = "Reports: ${patient.careReports.count()}"
    val birthdate ="Geburtstag: ${patient.birthday.dayOfMonth.toString().padStart(2, '0')}." +
            "${patient.birthday.monthNumber.toString().padStart(2, '0')}." +
            "${patient.birthday.year}"

    fun cellWasClicked(): String = patient.id
}

