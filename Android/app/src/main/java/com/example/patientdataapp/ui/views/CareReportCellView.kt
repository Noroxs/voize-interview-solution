package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.patientdataapp.data.data
import com.example.patientdataapp.ui.viewmodel.CareReportsCellViewModel


@Composable
fun CareReportCellView(cellViewModel: CareReportsCellViewModel) {
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
                text = cellViewModel.text,
                style = MaterialTheme.typography.bodyMedium)

            Divider(
                thickness = 0.2.dp,
                modifier = Modifier
                    .padding(vertical = 5.dp)
            )

            Column {
                CareReportCategoriesView(cellViewModel.categoryTypes)
                Spacer(modifier = Modifier.height(1.dp))
                Text(
                    text = cellViewModel.creationInformation,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CareReportCellViewPreview() {
    CareReportCellView(CareReportsCellViewModel(data.first().careReports.first()))
}