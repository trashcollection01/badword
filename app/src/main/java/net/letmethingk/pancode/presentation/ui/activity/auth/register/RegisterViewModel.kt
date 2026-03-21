package net.letmethingk.pancode.presentation.ui.activity.auth.register

import androidx.compose.foundation.text.input.TextFieldState
import androidx.lifecycle.ViewModel

class RegisterViewModel : ViewModel() {
    val inpUsernameTextState = TextFieldState()
    val inpEmailTextState = TextFieldState()
    val inpNewPassTextState = TextFieldState()
    val inpPassVerTextState = TextFieldState()
}