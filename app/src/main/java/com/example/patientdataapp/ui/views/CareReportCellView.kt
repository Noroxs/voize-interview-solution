package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.patientdataapp.data.data
import com.example.patientdataapp.ui.viewmodel.PatientListCellViewModel


@Composable
fun CareReportCellView(cellViewModel: PatientListCellViewModel) {
    Box(
        modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 5.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .fillMaxWidth()
    ) {
        Column(
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 7.dp)
        ) {
            Text(
                text ="Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
                style = MaterialTheme.typography.bodyMedium)

            Divider(
                thickness = 0.2.dp,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )

            Column {
                Text(
                    text = "15.07.2025 20:40 von Fr. Saad",
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

//CareReport(
//id = "f7fecf7f-72e9-4123-80eb-a4ed39cd263f",
//createdBy = "Fr. Saad",
//createdAt = Instant.parse("2022-05-05T10:45:13.533Z"),
//text = "Hat heute nicht gut mitgemacht, sie war schlecht gelaunt und wollte an den Beschäftigungangeboten nicht teilnehmen.",
//categories = listOf("Teilnahme", "Aktivität")


@Preview(showBackground = true)
@Composable
fun CareReportCellViewPreview() {
    CareReportCellView(cellViewModel = PatientListCellViewModel(data.first()) { })
}