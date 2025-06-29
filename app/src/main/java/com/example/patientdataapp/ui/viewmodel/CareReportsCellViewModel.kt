package com.example.patientdataapp.ui.viewmodel

import com.example.patientdataapp.datamodel.CareReport
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

class CareReportsCellViewModel(
    careReport: CareReport,
    timeZone: TimeZone = TimeZone.currentSystemDefault()
) {
    val text = careReport.text
    private val createdAt = careReport.createdAt.toLocalDateTime(timeZone)
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
