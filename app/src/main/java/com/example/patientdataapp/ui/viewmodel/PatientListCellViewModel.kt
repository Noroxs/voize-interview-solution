package com.example.patientdataapp.ui.viewmodel

import com.example.patientdataapp.datamodel.Patient

class PatientListCellViewModel(
    patient: Patient
) {
    val fullName = "${patient.salutation} ${patient.firstName} ${patient.lastName}"
    val reportsCount = "Reports: ${patient.careReports.count()}"
    val birthdate ="Geburtstag: ${patient.birthday.dayOfMonth.toString().padStart(2, '0')}." +
            "${patient.birthday.monthNumber.toString().padStart(2, '0')}." +
            "${patient.birthday.year}"
}
