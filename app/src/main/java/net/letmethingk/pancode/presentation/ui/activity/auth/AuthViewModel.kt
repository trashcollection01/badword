package net.letmethingk.pancode.presentation.ui.activity.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

open class AuthViewModel : ViewModel() {
    private val _showForm = MutableStateFlow(false)
    val showForm = _showForm.asStateFlow()
    fun switchForm(boolean: Boolean) {
        _showForm.value = boolean
    }
}