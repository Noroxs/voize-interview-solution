package org.example.voize.patientdataapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform