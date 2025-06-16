package com.example.patientdataapp.datamodel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.patientdataapp.datamodel.SupportedCategory.ACTIVITIES
import com.example.patientdataapp.datamodel.SupportedCategory.HEALTH
import com.example.patientdataapp.datamodel.SupportedCategory.HYGIENE
import com.example.patientdataapp.datamodel.SupportedCategory.PARTICIPATION
import com.example.patientdataapp.datamodel.SupportedCategory.UNKNOWN
import com.example.patientdataapp.datamodel.SupportedCategory.WELL_BEING
import com.example.patientdataapp.ui.icons.ActivityIcon
import com.example.patientdataapp.ui.icons.HealthIcon
import com.example.patientdataapp.ui.icons.HygieneIcon
import com.example.patientdataapp.ui.icons.ParticipationIcon
import com.example.patientdataapp.ui.icons.WellbeingIcon

data class CategoryType(
    val title: String
) {
    private val supportedCategory = SupportedCategory.from(title)

    val color: Color = when (supportedCategory) {
        WELL_BEING -> Color.Green
        HEALTH -> Color.Blue
        PARTICIPATION -> Color.Yellow
        ACTIVITIES -> Color.Red
        HYGIENE -> Color.Cyan
        UNKNOWN -> Color.Gray
    }

    val image: ImageVector? = when (supportedCategory) {
        WELL_BEING -> WellbeingIcon
        HEALTH -> HealthIcon
        PARTICIPATION -> ParticipationIcon
        ACTIVITIES -> ActivityIcon
        HYGIENE -> HygieneIcon
        UNKNOWN -> null
    }
}

enum class SupportedCategory(val title: String) {
    WELL_BEING("Wohlbefinden"),
    HEALTH("Gesundheit"),
    PARTICIPATION("Teilnahme"),
    ACTIVITIES("Aktivität"),
    HYGIENE("Hygiene"),
    UNKNOWN("Unknown");

    companion object {
        fun from(string: String): SupportedCategory {
            return entries.find { it.title.equals(string, ignoreCase = true) }
                ?: UNKNOWN
        }
    }
}