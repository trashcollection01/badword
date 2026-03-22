package net.letmethingk.pancode.presentation.ui.activity.auth.login

import androidx.compose.foundation.text.input.TextFieldState
import androidx.lifecycle.ViewModel
import net.letmethingk.pancode.presentation.ui.activity.auth.AuthViewModel

class LoginViewModel : AuthViewModel() {
    val inpUsernameTextState = TextFieldState()
    val inpPassTextState = TextFieldState()
}