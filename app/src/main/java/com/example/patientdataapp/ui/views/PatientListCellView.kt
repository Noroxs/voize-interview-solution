package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun PatientListCellView(cellViewModel: PatientListCellViewModel) {
    Box(
        modifier = Modifier
            .padding(horizontal = 15.dp, vertical = 5.dp)
            .shadow(
                elevation = 8.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .fillMaxWidth()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(horizontal = 15.dp, vertical = 7.dp)
        ) {
            Column {
                Text(
                    text = cellViewModel.fullName,
                    style = MaterialTheme.typography.titleLarge,
                )
                Text(
                    text = cellViewModel.birthdate,
                    style = MaterialTheme.typography.titleSmall,
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = cellViewModel.reportsCount,
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PatientListCellViewPreview() {
    PatientListCellView(cellViewModel = PatientListCellViewModel(data.first()))
}