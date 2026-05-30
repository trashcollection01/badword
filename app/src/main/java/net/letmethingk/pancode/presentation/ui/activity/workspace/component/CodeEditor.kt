package net.letmethingk.pancode.presentation.ui.activity.workspace.component

import androidx.compose.foundation.text.input.TextFieldState


class CodeEditor(

    override val contentName: String,

    val textFieldState: TextFieldState = TextFieldState(),

    val filePathList: List<String> = listOf()

) : Content()