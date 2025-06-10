package com.example.patientdataapp.datamodel

import kotlinx.datetime.Instant

data class CareReport(
    val id: String,
    val createdAt: Instant,
    val createdBy: String,
    val text: String,
    val categories: List<String>
)