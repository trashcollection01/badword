package net.letmethingk.pancode.presentation.ui.activity.auth.login

import androidx.compose.foundation.text.input.TextFieldState
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {
    val inpUsernameTextState = TextFieldState()
    val inpPassTextState = TextFieldState()
}