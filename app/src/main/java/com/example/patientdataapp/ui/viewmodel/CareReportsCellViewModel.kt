package com.example.patientdataapp.ui.viewmodel

import com.example.patientdataapp.datamodel.CareReport
import com.example.patientdataapp.datamodel.Patient
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class CareReportsCellViewModel(
    careReport: CareReport
) {
    val text = careReport.text
    private val createdAt = careReport.createdAt.toLocalDateTime(TimeZone.currentSystemDefault())
    val creationInformation = "${createdAt.dayOfMonth.toString().padStart(2, '0')}." +
                "${createdAt.monthNumber.toString().padStart(2, '0')}." +
                "${createdAt.year}" +
                " " +
                "${createdAt.hour.toString().padStart(2, '0')}:" +
                createdAt.minute.toString().padStart(2, '0') +
                " von " +
                careReport.createdBy
    val categoryTypes = careReport.categoryTypes
}
