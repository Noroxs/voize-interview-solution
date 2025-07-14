package com.example.patientdataapp.ui.views

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.patientdataapp.datamodel.CategoryType
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun PillView(
    modifier: Modifier = Modifier,
    text: String,
    color: Color,
    icon: ImageVector? = null,
) {
    Surface(
        modifier = modifier
            .padding(horizontal = 0.dp, vertical = 1.dp),
        color = color,
        shape = RoundedCornerShape(8.dp),
        shadowElevation = 2.dp,
        border = BorderStroke(1.dp, color = Color.DarkGray)
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .padding(4.dp)
                .height(10.dp)
        ) {
            icon?.let {
                Icon(
                    icon,
                    contentDescription = text,
                    modifier = Modifier.size(8.dp)
                )
                Spacer(modifier = Modifier.width(1.dp))
            }

            Text(
                text = text,
                fontSize = 7.sp,
                lineHeight = 8.sp,
                maxLines = 1,
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier
                    .padding(0.dp)
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
    ) {
        for (category in categories) {
            Row {
                PillView(
                    text = category.title,
                    color = category.color,
                    icon = category.image
                )
                Spacer(modifier = Modifier.width(2.dp))
            }

        }
    }
}

@Preview()
@Composable
fun CareReportCategoriesViewPreview() {
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