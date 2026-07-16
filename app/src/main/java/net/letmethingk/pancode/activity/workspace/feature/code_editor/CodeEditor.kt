package net.letmethingk.pancode.activity.workspace.feature.code_editor

import androidx.compose.foundation.text.input.TextFieldState
import net.letmethingk.pancode.activity.workspace.feature.ContentTab

class CodeEditor(

    override val contentName: String,

    val textFieldState: TextFieldState = TextFieldState(),

    val filePath: String = "unknown file path"

) : ContentTab()