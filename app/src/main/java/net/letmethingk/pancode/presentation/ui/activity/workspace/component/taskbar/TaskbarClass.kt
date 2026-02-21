package net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar

import androidx.compose.runtime.Composable

data class TaskbarClass(
    val number: Int,
    val name: String
) {
    constructor() : this(number = 0, name = "pancode") {}

}