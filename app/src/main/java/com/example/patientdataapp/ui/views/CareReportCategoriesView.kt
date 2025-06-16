package com.example.patientdataapp.ui.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.patientdataapp.datamodel.CategoryType
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun CareReportCategoryView(category: CategoryType, modifier: Modifier = Modifier) {
    Box(
        modifier = modifier
            .padding(horizontal = 2.dp, vertical = 5.dp)
            .shadow(
                elevation = 2.dp,
                shape = RoundedCornerShape(16.dp),
                clip = false
            )
            .background(
                color = MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .border(
                width = 1.dp,
                shape = RoundedCornerShape(16.dp),
                color = Color.DarkGray
            )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(category.color)
                .padding(horizontal = 5.dp, vertical = 5.dp)
                .height(10.dp)
        ) {
            category.image?.let {
                Icon(
                    category.image,
                    contentDescription = category.title,
                )
                Spacer(modifier = Modifier.width(1.dp))
            }

            Text(
                text = category.title,
                style = MaterialTheme.typography.titleLarge,
                fontSize = 7.sp
            )
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun CareReportCategoriesView(categories: List<CategoryType>) {
    FlowRow(
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier
            .fillMaxWidth()
            .padding(2.dp)
    ) {
        for (category in categories) {
            CareReportCategoryView(category = category)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CareReportCategoriesViewPreview() {
    //CareReportCategoryView(CategoryType("Wohlbefinden"))
    CareReportCategoriesView(
        listOf(
            CategoryType("Wohlbefinden"),
            CategoryType("Gesundheit"),
            CategoryType("Teilnahme"),
            CategoryType("Aktivität"),
            CategoryType("Hygiene"),
            CategoryType("Unknown")
            )
    )
}