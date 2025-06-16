package com.example.patientdataapp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.patientdataapp.datamodel.CategoryType
import com.example.patientdataapp.ui.icons.ActivityIcon
import com.example.patientdataapp.ui.icons.HealthIcon
import com.example.patientdataapp.ui.icons.HygieneIcon
import com.example.patientdataapp.ui.icons.ParticipationIcon
import com.example.patientdataapp.ui.icons.WellbeingIcon
import org.junit.Test
import org.junit.Assert.*

class CategoryTypeTest {

    private val categoryData = listOf(
        listOf("Wohlbefinden", Color.Green, WellbeingIcon),
        listOf("Gesundheit", Color.Blue, HealthIcon),
        listOf("Teilnahme", Color.Yellow, ParticipationIcon),
        listOf("Aktivität", Color.Red, ActivityIcon),
        listOf("Hygiene", Color.Cyan, HygieneIcon),
        listOf("UnknownCategory", Color.Gray, null)
    )

    @Test
    fun categoryType_color_isCorrect() {
        categoryData.forEach {
            val categoryType = CategoryType(it[0] as String)
            assertEquals(it[1] as? Color, categoryType.color)
        }
    }

    @Test
    fun categoryType_image_isCorrect() {
        categoryData.forEach {
            val categoryType = CategoryType(it[0] as String)
            assertEquals(it[2] as? ImageVector, categoryType.image)
        }
    }
}





