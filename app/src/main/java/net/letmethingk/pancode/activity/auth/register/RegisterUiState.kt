package net.letmethingk.pancode.activity.auth.register

import androidx.compose.foundation.text.input.TextFieldState

class RegisterUiState(

    val usernameInput: TextFieldState = TextFieldState(),

    val emailInput: TextFieldState = TextFieldState(),

    val passwordInput: TextFieldState = TextFieldState(),

    val reenterPasswordInput: TextFieldState = TextFieldState(),

)