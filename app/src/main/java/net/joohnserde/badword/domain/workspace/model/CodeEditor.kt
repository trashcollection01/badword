package net.joohnserde.badword.domain.workspace.model

import androidx.compose.foundation.text.input.TextFieldState

class CodeEditor(

    override val contentName: String,

    val textFieldState: TextFieldState = TextFieldState(),

    val filePath: String = "unknown file path"

) : Content