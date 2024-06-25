package su.afk.todocompose.data.local.models

import androidx.compose.ui.graphics.Color
import su.afk.todocompose.ui.theme.HighPriorityColor
import su.afk.todocompose.ui.theme.LowPriorityColor
import su.afk.todocompose.ui.theme.MediumPriorityColor
import su.afk.todocompose.ui.theme.NonePriorityColor

enum class Priority(val color: Color) {
    HIGH(HighPriorityColor),
    MEDIUM(MediumPriorityColor),
    LOW(LowPriorityColor),
    NONE(NonePriorityColor),
}