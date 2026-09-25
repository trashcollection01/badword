package net.joohnserde.badword.presentation.auth

import androidx.compose.ui.text.LinkInteractionListener
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.joohnserde.badword.presentation.auth.login.LoginUiState
import net.joohnserde.badword.presentation.auth.register.RegisterUiState

open class AuthViewModel : ViewModel() {

    private val _loginState = MutableStateFlow(LoginUiState())
    val loginState = _loginState.asStateFlow()

    private val _registerState = MutableStateFlow(RegisterUiState())
    val registerState = _registerState.asStateFlow()

    private val _showForm = MutableStateFlow(false)
    val showForm = _showForm.asStateFlow()

    fun switchForm(boolean: Boolean): LinkInteractionListener {
        return { _showForm.value = boolean }
    }
}