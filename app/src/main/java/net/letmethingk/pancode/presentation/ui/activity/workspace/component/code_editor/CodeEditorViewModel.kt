package net.letmethingk.pancode.presentation.ui.activity.workspace.component.code_editor

import androidx.compose.foundation.text.input.TextFieldState
import androidx.lifecycle.ViewModel

class CodeEditorViewModel : ViewModel() {
    val codeTextState = TextFieldState(initialText = code)
    val listFilePath = mutableListOf<String>()
}