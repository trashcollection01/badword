package net.letmethingk.pancode.presentation.ui.activity.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.text.LinkInteractionListener
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.letmethingk.pancode.presentation.ui.activity.auth.login.LoginUiState
import net.letmethingk.pancode.presentation.ui.activity.auth.register.RegisterUiState

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