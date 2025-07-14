package com.example.patientdataapp.data

import com.example.patientdataapp.datamodel.CareReport
import com.example.patientdataapp.datamodel.Patient
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate

val data = listOf(
    Patient(
        id = "b270b476-e2c2-11ec-8fea-0242ac120002",
        salutation = "Frau",
        firstName = "Jutta",
        lastName = "Adlermann",
        birthday = LocalDate.parse("1961-02-12"),
        careReports = listOf(
            CareReport(
                id = "b770ee14-e2c2-11ec-8fea-0242ac120002",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T14:45:13.533Z"),
                text = "Keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "f7fecf7f-72e9-4123-80eb-a4ed39cd263f",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
                categories = listOf("Teilnahme", "Aktivität")
            )
        )
    ),
    Patient(
        id = "e17019fc-5855-4174-a4fd-1c0e090d6264",
        salutation = "Herr",
        firstName = "Bernd",
        lastName = "Krause",
        birthday = LocalDate.parse("1958-03-12"),
        careReports = listOf(
            CareReport(
                id = "211656b0-57b6-48f0-b567-8e5f46dc7607",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T12:42:13.533Z"),
                text = "Keine Probleme beim Waschen. Hat sehr gut mitgemacht und haben uns gut unterhalten. Er hat von seinen Enkelkindern gesprochen.",
                categories = listOf("Hygiene", "Wohlbefinden")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde für den Tag versorgt und hat leichten Husten.",
                categories = listOf("Gesundheit")
            )
        )
    ),
    Patient(
        id = "82e9093c-44eb-4a45-9f9b-17c1f78314e6",
        salutation = "Herr",
        firstName = "Jörg",
        lastName = "Bauer",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "f8b0f340-177f-4420-ba41-6bcaab99b52b",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T17:23:02.533Z"),
                text = "Hat sich schwach gefühlt und ließ sich schon vor dem Abendessen ins Bett bringen.",
                categories = listOf("Wohlbefinden", "Aktivität")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde mit Hilfe der Pflegekraft am Waschbecken versorgt.",
                categories = listOf("Hygiene")
            ),
            CareReport(
                id = "fe7e524c-0648-4e37-8bc3-0ff96184bec8",
                createdBy = "Hr. Siebert",
                createdAt = Instant.parse("2022-05-05T00:20:13.533Z"),
                text = "Nachtwache alles gut. Keine Auffälligkeiten.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "92963f64-c83f-4282-97be-099b6ca82666",
        salutation = "Frau",
        firstName = "Gerhard",
        lastName = "Jankowski",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T19:45:13.533Z"),
                text = "Ließ sich für die Nacht versorgen, hatte keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:20:13.533Z"),
                text = "Sie klagt über leichte Rückenschmerzen. Sie wurde beim Toilettengang unterstützt und nach dem Frühstück wieder ins Bett gelegt.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "b270b476-e2c2-11ec-8fea-0242ac120002",
        salutation = "Frau",
        firstName = "Jutta",
        lastName = "Adlermann",
        birthday = LocalDate.parse("1961-02-12"),
        careReports = listOf(
            CareReport(
                id = "b770ee14-e2c2-11ec-8fea-0242ac120002",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T14:45:13.533Z"),
                text = "Keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "f7fecf7f-72e9-4123-80eb-a4ed39cd263f",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
                categories = listOf("Teilnahme", "Aktivität")
            )
        )
    ),
    Patient(
        id = "e17019fc-5855-4174-a4fd-1c0e090d6264",
        salutation = "Herr",
        firstName = "Bernd",
        lastName = "Krause",
        birthday = LocalDate.parse("1958-03-12"),
        careReports = listOf(
            CareReport(
                id = "211656b0-57b6-48f0-b567-8e5f46dc7607",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T12:42:13.533Z"),
                text = "Keine Probleme beim Waschen. Hat sehr gut mitgemacht und haben uns gut unterhalten. Er hat von seinen Enkelkindern gesprochen.",
                categories = listOf("Hygiene", "Wohlbefinden")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde für den Tag versorgt und hat leichten Husten.",
                categories = listOf("Gesundheit")
            )
        )
    ),
    Patient(
        id = "82e9093c-44eb-4a45-9f9b-17c1f78314e6",
        salutation = "Herr",
        firstName = "Jörg",
        lastName = "Bauer",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "f8b0f340-177f-4420-ba41-6bcaab99b52b",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T17:23:02.533Z"),
                text = "Hat sich schwach gefühlt und ließ sich schon vor dem Abendessen ins Bett bringen.",
                categories = listOf("Wohlbefinden", "Aktivität")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde mit Hilfe der Pflegekraft am Waschbecken versorgt.",
                categories = listOf("Hygiene")
            ),
            CareReport(
                id = "fe7e524c-0648-4e37-8bc3-0ff96184bec8",
                createdBy = "Hr. Siebert",
                createdAt = Instant.parse("2022-05-05T00:20:13.533Z"),
                text = "Nachtwache alles gut. Keine Auffälligkeiten.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "92963f64-c83f-4282-97be-099b6ca82666",
        salutation = "Frau",
        firstName = "Gerhard",
        lastName = "Jankowski",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T19:45:13.533Z"),
                text = "Ließ sich für die Nacht versorgen, hatte keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:20:13.533Z"),
                text = "Sie klagt über leichte Rückenschmerzen. Sie wurde beim Toilettengang unterstützt und nach dem Frühstück wieder ins Bett gelegt.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "b270b476-e2c2-11ec-8fea-0242ac120002",
        salutation = "Frau",
        firstName = "Jutta",
        lastName = "Adlermann",
        birthday = LocalDate.parse("1961-02-12"),
        careReports = listOf(
            CareReport(
                id = "b770ee14-e2c2-11ec-8fea-0242ac120002",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T14:45:13.533Z"),
                text = "Keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "f7fecf7f-72e9-4123-80eb-a4ed39cd263f",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
                categories = listOf("Teilnahme", "Aktivität")
            )
        )
    ),
    Patient(
        id = "e17019fc-5855-4174-a4fd-1c0e090d6264",
        salutation = "Herr",
        firstName = "Bernd",
        lastName = "Krause",
        birthday = LocalDate.parse("1958-03-12"),
        careReports = listOf(
            CareReport(
                id = "211656b0-57b6-48f0-b567-8e5f46dc7607",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T12:42:13.533Z"),
                text = "Keine Probleme beim Waschen. Hat sehr gut mitgemacht und haben uns gut unterhalten. Er hat von seinen Enkelkindern gesprochen.",
                categories = listOf("Hygiene", "Wohlbefinden")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde für den Tag versorgt und hat leichten Husten.",
                categories = listOf("Gesundheit")
            )
        )
    ),
    Patient(
        id = "82e9093c-44eb-4a45-9f9b-17c1f78314e6",
        salutation = "Herr",
        firstName = "Jörg",
        lastName = "Bauer",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "f8b0f340-177f-4420-ba41-6bcaab99b52b",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T17:23:02.533Z"),
                text = "Hat sich schwach gefühlt und ließ sich schon vor dem Abendessen ins Bett bringen.",
                categories = listOf("Wohlbefinden", "Aktivität")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde mit Hilfe der Pflegekraft am Waschbecken versorgt.",
                categories = listOf("Hygiene")
            ),
            CareReport(
                id = "fe7e524c-0648-4e37-8bc3-0ff96184bec8",
                createdBy = "Hr. Siebert",
                createdAt = Instant.parse("2022-05-05T00:20:13.533Z"),
                text = "Nachtwache alles gut. Keine Auffälligkeiten.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "92963f64-c83f-4282-97be-099b6ca82666",
        salutation = "Frau",
        firstName = "Gerhard",
        lastName = "Jankowski",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T19:45:13.533Z"),
                text = "Ließ sich für die Nacht versorgen, hatte keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:20:13.533Z"),
                text = "Sie klagt über leichte Rückenschmerzen. Sie wurde beim Toilettengang unterstützt und nach dem Frühstück wieder ins Bett gelegt.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "b270b476-e2c2-11ec-8fea-0242ac120002",
        salutation = "Frau",
        firstName = "Jutta",
        lastName = "Adlermann",
        birthday = LocalDate.parse("1961-02-12"),
        careReports = listOf(
            CareReport(
                id = "b770ee14-e2c2-11ec-8fea-0242ac120002",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T14:45:13.533Z"),
                text = "Keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "f7fecf7f-72e9-4123-80eb-a4ed39cd263f",
                createdBy = "Fr. Saad",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
                categories = listOf("Teilnahme", "Aktivität")
            )
        )
    ),
    Patient(
        id = "e17019fc-5855-4174-a4fd-1c0e090d6264",
        salutation = "Herr",
        firstName = "Bernd",
        lastName = "Krause",
        birthday = LocalDate.parse("1958-03-12"),
        careReports = listOf(
            CareReport(
                id = "211656b0-57b6-48f0-b567-8e5f46dc7607",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T12:42:13.533Z"),
                text = "Keine Probleme beim Waschen. Hat sehr gut mitgemacht und haben uns gut unterhalten. Er hat von seinen Enkelkindern gesprochen.",
                categories = listOf("Hygiene", "Wohlbefinden")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Schröder",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde für den Tag versorgt und hat leichten Husten.",
                categories = listOf("Gesundheit")
            )
        )
    ),
    Patient(
        id = "82e9093c-44eb-4a45-9f9b-17c1f78314e6",
        salutation = "Herr",
        firstName = "Jörg",
        lastName = "Bauer",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "f8b0f340-177f-4420-ba41-6bcaab99b52b",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T17:23:02.533Z"),
                text = "Hat sich schwach gefühlt und ließ sich schon vor dem Abendessen ins Bett bringen.",
                categories = listOf("Wohlbefinden", "Aktivität")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
                text = "Wurde mit Hilfe der Pflegekraft am Waschbecken versorgt.",
                categories = listOf("Hygiene")
            ),
            CareReport(
                id = "fe7e524c-0648-4e37-8bc3-0ff96184bec8",
                createdBy = "Hr. Siebert",
                createdAt = Instant.parse("2022-05-05T00:20:13.533Z"),
                text = "Nachtwache alles gut. Keine Auffälligkeiten.",
                categories = listOf()
            )
        )
    ),
    Patient(
        id = "92963f64-c83f-4282-97be-099b6ca82666",
        salutation = "Frau",
        firstName = "Gerhard",
        lastName = "Jankowski",
        birthday = LocalDate.parse("1946-01-20"),
        careReports = listOf(
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T19:45:13.533Z"),
                text = "Ließ sich für die Nacht versorgen, hatte keine weiteren Beschwerden.",
                categories = listOf("Wohlbefinden", "Gesundheit")
            ),
            CareReport(
                id = "b0cc9dc8-1908-4af5-a241-2a97a8d5f35f",
                createdBy = "Hr. Seib",
                createdAt = Instant.parse("2022-05-05T10:20:13.533Z"),
                text = "Sie klagt über leichte Rückenschmerzen. Sie wurde beim Toilettengang unterstützt und nach dem Frühstück wieder ins Bett gelegt.",
                categories = listOf()
            )
        )
    )
)