package com.example.patientdataapp.ui.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HygieneIcon: ImageVector
    get() {
        if (_HygieneIcon != null) return _HygieneIcon!!

        _HygieneIcon = ImageVector.Builder(
            name = "Wash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 960f,
            viewportHeight = 960f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(700f, 320f)
                quadToRelative(-39f, 0f, -69.5f, -30.5f)
                reflectiveQuadTo(600f, 220f)
                quadToRelative(0f, -35f, 23f, -77.5f)
                reflectiveQuadTo(700f, 40f)
                quadToRelative(54f, 60f, 77f, 102.5f)
                reflectiveQuadToRelative(23f, 77.5f)
                quadToRelative(0f, 39f, -30.5f, 69.5f)
                reflectiveQuadTo(700f, 320f)
                moveTo(240f, 880f)
                quadToRelative(-66f, 0f, -113f, -47f)
                reflectiveQuadTo(80f, 720f)
                verticalLineToRelative(-216f)
                quadToRelative(0f, -31f, 14.5f, -57.5f)
                reflectiveQuadTo(135f, 403f)
                lineToRelative(330f, -214f)
                lineToRelative(20f, 20f)
                quadToRelative(20f, 20f, 23.5f, 47.5f)
                reflectiveQuadTo(497f, 308f)
                lineToRelative(-45f, 72f)
                horizontalLineToRelative(308f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(800f, 420f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(760f, 460f)
                horizontalLineTo(308f)
                lineToRelative(77f, -124f)
                lineToRelative(-207f, 134f)
                quadToRelative(-9f, 5f, -13.5f, 14f)
                reflectiveQuadToRelative(-4.5f, 20f)
                verticalLineToRelative(216f)
                quadToRelative(0f, 33f, 23.5f, 56.5f)
                reflectiveQuadTo(240f, 800f)
                horizontalLineToRelative(480f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(760f, 840f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(720f, 880f)
                close()
                moveToRelative(240f, -280f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(360f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(880f, 560f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(840f, 600f)
                close()
                moveToRelative(0f, 140f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(320f)
                quadToRelative(17f, 0f, 28.5f, 11.5f)
                reflectiveQuadTo(840f, 700f)
                reflectiveQuadToRelative(-11.5f, 28.5f)
                reflectiveQuadTo(800f, 740f)
                close()
                moveTo(320f, 600f)
            }
        }.build()

        return _HygieneIcon!!
    }

private var _HygieneIcon: ImageVector? = null

