package net.letmethingk.pancode.presentation.ui.activity.auth.login

import androidx.compose.foundation.clickable
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
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.activity.auth.AuthViewModel
import net.letmethingk.pancode.presentation.ui.activity.auth.CustomTextClickable
import net.letmethingk.pancode.presentation.ui.common.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.common.widgets_component.ButtonLarge
import net.letmethingk.pancode.presentation.ui.common.widgets_component.CustomTextField
import net.letmethingk.pancode.presentation.ui.common.widgets_component.IconButton24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun LoginScreen() {

    val viewModel: AuthViewModel = viewModel()
    val loginUiState by viewModel.loginState.collectAsStateWithLifecycle()

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
                text = "Sign in",
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
            input = loginUiState.usernameInput,
            label = "Username"
        )

        Spacer(modifier = Modifier.height(20.dp))
        CustomTextField(
            input = loginUiState.passwordInput,
            label = "Password"
        )

        Spacer(Modifier.height(15.dp))
        Text(
            text = "Forgot password",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .clickable(
                    onClick = {}
                )
                .align(alignment = Alignment.End),
        )

        Spacer(Modifier.height(35.dp))
        ButtonLarge(
            onClick = {  },
            text = "Login"
        )

        Spacer(Modifier.height(20.dp))
        CustomTextClickable(
            textBeforeLink = "Don't have an account? ",
            textLink = "Register"
        ) { viewModel.switchForm(true) }
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    PancodeTheme {
        LoginScreen()
    }
}