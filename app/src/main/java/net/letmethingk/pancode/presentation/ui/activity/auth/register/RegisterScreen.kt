package net.letmethingk.pancode.presentation.ui.activity.auth.register

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
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.common.components.ButtonLarge
import net.letmethingk.pancode.presentation.ui.common.components.CustomTextField
import net.letmethingk.pancode.presentation.ui.common.components.IconButton24
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun RegisterScreen(
    modifier: Modifier,
    viewModel: RegisterViewModel = viewModel()
) {
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
            IconButton24(
                onClick = {  },
                imageVector = defic24,
                contentDescription = ""
            )
        }
        Spacer(Modifier.height(100.dp))
        CustomTextField(
            input = viewModel.inpUsernameTextState,
            label = "Username"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = viewModel.inpEmailTextState,
            label = "Email"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = viewModel.inpNewPassTextState,
            label = "New password"
        )
        Spacer(Modifier.height(25.dp))
        CustomTextField(
            input = viewModel.inpPassVerTextState,
            label = "Re-enter password"
        )
        Spacer(Modifier.height(55.dp))
        ButtonLarge(
            onClick = {},
            text = "Register"
        )
        Spacer(Modifier.height(30.dp))
        Text(
            text = buildAnnotatedString {
                append("Already have an account? ")
                val link = LinkAnnotation.Clickable(
                    tag = "onClick",
                    styles = TextLinkStyles(
                        style = SpanStyle(
                            color = MaterialTheme.colorScheme.secondary,
                            textDecoration = TextDecoration.None
                        )
                    ),
                    // Do something
                    linkInteractionListener = {
                        println("diClick")
                    }
                )
                withLink(link = link) {
                    append(text = "Login")
                }
            },
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
