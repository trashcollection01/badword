package net.letmethingk.pancode.presentation.ui.activity.sign_in

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldDecorator
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.ButtonLarge
import net.letmethingk.pancode.presentation.ui.components.reusable.CustomTextField
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun LoginScreen(modifier: Modifier) {
    val inpName = rememberTextFieldState(initialText = "Memungkinkan Anda, ttttt F")
    val inpPass = rememberTextFieldState(initialText = "Mengunakan ganja")
    Column(
        verticalArrangement = Arrangement.Top,
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 25.dp)
            .padding(top = 45.dp),
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
            Icon(
                imageVector = defic24,
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(100.dp))
        CustomTextField(
            input = inpName,
            label = "Username"
        )
        Spacer(modifier = Modifier.height(25.dp))
        CustomTextField(
            input = inpPass,
            label = "Password"
        )
        Spacer(Modifier.height(20.dp))
        Text(
            text = "Forgot password",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .clickable(
                    onClick = {}
                )
                .fillMaxWidth(),
            textAlign = TextAlign.End
        )
        Spacer(Modifier.height(35.dp))
        ButtonLarge(
            onClick = {},
            text = "Log in"
        )
        Spacer(Modifier.height(30.dp))
        Text(
            text = "Don't have an account? Register",
            style = MaterialTheme.typography.bodyMedium,
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Start
        )

    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    PancodeTheme {
        LoginScreen(modifier = Modifier)
    }
}