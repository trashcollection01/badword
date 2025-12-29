package net.letmethingk.pancode.presentation.ui.activity.sign_up

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.ButtonLarge
import net.letmethingk.pancode.presentation.ui.components.reusable.CustomTextField
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun RegisterScreen(modifier: Modifier) {
    val inpUsername = rememberTextFieldState()
    val inpEmail = rememberTextFieldState()
    val inpNewPass = rememberTextFieldState()
    val inpPassVer = rememberTextFieldState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 25.dp)
            .padding(top = 45.dp),
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
            Icon(
                imageVector = defic24,
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(100.dp))
        CustomTextField(
            input = inpUsername,
            label = "Username"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = inpEmail,
            label = "Email"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = inpNewPass,
            label = "New password"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = inpPassVer,
            label = "Re-enter password"
        )
        Spacer(Modifier.height(55.dp))
        ButtonLarge(
            onClick = {},
            text = "Register"
        )
        Spacer(Modifier.height(30.dp))
        Text(
            text = "Already have an account? ",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier.align(alignment = Alignment.Start),
        )
    }
}

@Preview
@Composable
fun RegisterScreenPreview() {
    PancodeTheme {
        RegisterScreen(modifier = Modifier)
    }
}
