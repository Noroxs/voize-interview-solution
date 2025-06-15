package com.example.patientdataapp.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HealthIcon: ImageVector
    get() {
        if (_HealthIcon != null) return _HealthIcon!!

        _HealthIcon = ImageVector.Builder(
            name = "Health_and_safety",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(420f, 620f)
                horizontalLineToRelative(120f)
                verticalLineToRelative(-100f)
                horizontalLineToRelative(100f)
                verticalLineToRelative(-120f)
                horizontalLineTo(540f)
                verticalLineToRelative(-100f)
                horizontalLineTo(420f)
                verticalLineToRelative(100f)
                horizontalLineTo(320f)
                verticalLineToRelative(120f)
                horizontalLineToRelative(100f)
                close()
                moveToRelative(60f, 260f)
                quadToRelative(-139f, -35f, -229.5f, -159.5f)
                reflectiveQuadTo(160f, 444f)
                verticalLineToRelative(-244f)
                lineToRelative(320f, -120f)
                lineToRelative(320f, 120f)
                verticalLineToRelative(244f)
                quadToRelative(0f, 152f, -90.5f, 276.5f)
                reflectiveQuadTo(480f, 880f)
                moveToRelative(0f, -84f)
                quadToRelative(104f, -33f, 172f, -132f)
                reflectiveQuadToRelative(68f, -220f)
                verticalLineToRelative(-189f)
                lineToRelative(-240f, -90f)
                lineToRelative(-240f, 90f)
                verticalLineToRelative(189f)
                quadToRelative(0f, 121f, 68f, 220f)
                reflectiveQuadToRelative(172f, 132f)
                moveToRelative(0f, -316f)
            }
        }.build()

        return _HealthIcon!!
    }

private var _HealthIcon: ImageVector? = null

