package net.joohnserde.badword.activity.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.auth.login.LoginScreen
import net.joohnserde.badword.activity.auth.register.RegisterScreen
import net.joohnserde.badword.core.ui.theme.PancodeTheme

@Composable
fun AuthScreen(modifier: Modifier) {

    val viewModel: AuthViewModel = viewModel()
    val uiState = viewModel.showForm.collectAsStateWithLifecycle()

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 25.dp)
            .padding(top = 45.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) { if (uiState.value) RegisterScreen() else LoginScreen() }
}

@Preview()
@Composable
fun AuthScreenPreview() {
    PancodeTheme() {
        AuthScreen(Modifier)
    }
}