package net.letmethingk.pancode.presentation.ui.activity.code_editor

import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.letmethingk.pancode.presentation.ui.activity.code_editor.component.code

class CodeEditorViewModel : ViewModel() {
    val codeTextState = TextFieldState(initialText = code)
    val listFilePath = mutableListOf<String>()
}