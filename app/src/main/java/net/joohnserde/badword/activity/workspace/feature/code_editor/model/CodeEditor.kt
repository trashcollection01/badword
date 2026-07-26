package net.joohnserde.badword.activity.workspace.feature.code_editor.model

import androidx.compose.foundation.text.input.TextFieldState
import net.joohnserde.badword.activity.workspace.feature.content_tab.model.Content

class CodeEditor(

    override val contentName: String,

    val textFieldState: TextFieldState = TextFieldState(),

    val filePath: String = "unknown file path"

) : Content