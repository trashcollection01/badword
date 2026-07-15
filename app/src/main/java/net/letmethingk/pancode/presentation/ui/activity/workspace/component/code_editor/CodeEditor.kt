package net.letmethingk.pancode.presentation.ui.activity.workspace.component.code_editor

import androidx.compose.foundation.text.input.TextFieldState
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.ContentTab

class CodeEditor(

    override val contentName: String,

    val textFieldState: TextFieldState = TextFieldState(),

    val filePath: String = "unknown file path"

) : ContentTab()