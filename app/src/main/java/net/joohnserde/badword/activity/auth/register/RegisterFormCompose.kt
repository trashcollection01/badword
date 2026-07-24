package net.joohnserde.badword.activity.auth.register

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.auth.AuthViewModel
import net.joohnserde.badword.core.ui.reusable.widgets.CustomTextClickable
import net.joohnserde.badword.core.ui.reusable.vectors.defic24
import net.joohnserde.badword.core.ui.reusable.widgets.ButtonLarge
import net.joohnserde.badword.core.ui.reusable.widgets.CustomTextField
import net.joohnserde.badword.core.ui.reusable.widgets.IconButton24
import net.joohnserde.badword.core.ui.theme.BadwordTheme

@Composable
fun RegisterScreen() {

    val viewModel: AuthViewModel = viewModel()
    val registerUiState by viewModel.registerState.collectAsStateWithLifecycle()

    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                text = "Sign Up",
                style = MaterialTheme.typography.headlineLarge
            )

            IconButton24(
                onClick = {  },
                imageVector = defic24,
                contentDescription = ""
            )
        }

        Spacer(Modifier.height(90.dp))
        CustomTextField(
            input = registerUiState.usernameInput,
            label = "Username"
        )

        Spacer(Modifier.height(20.dp))
        CustomTextField(
            input = registerUiState.emailInput,
            label = "Email"
        )

        Spacer(Modifier.height(20.dp))
        CustomTextField(
            input = registerUiState.passwordInput,
            label = "New password"
        )

        Spacer(Modifier.height(20.dp))
        CustomTextField(
            input = registerUiState.reenterPasswordInput,
            label = "Re-enter password"
        )

        Spacer(Modifier.height(50.dp))
        ButtonLarge(
            onClick = {},
            text = "Register"
        )

        Spacer(Modifier.height(20.dp))
        CustomTextClickable(
            textBeforeLink = "Already have an account? ",
            textLink = "Login"
        ) { viewModel.switchForm(false) }
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    BadwordTheme {
        RegisterScreen()
    }
}
