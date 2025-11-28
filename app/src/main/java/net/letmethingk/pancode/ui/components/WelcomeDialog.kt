package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import net.letmethingk.pancode.ui.components.reusable.ButtonMedium
import net.letmethingk.pancode.ui.theme.PancodeTheme

/*
 * Welcome Dialog
 * Composable WelcomeDialog() to display
 *
 * */
@Composable
fun WelcomeDialog(onConfirm: () -> Unit) {
    Dialog(onDismissRequest = { onConfirm }) {
        Column(
            modifier = Modifier
                .width(325.dp)
                .height(400.dp)
                .background(
                    color = MaterialTheme.colorScheme.surfaceContainerLow,
                    shape = RoundedCornerShape(25.dp)
                )
                .padding(all = 20.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
//            Text content
            Column {
                Text(
                    text = "Welcome to Pancode",
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text(
                    text = "Just with your mobile device," +
                            "you can do coding.",
                    style = MaterialTheme.typography.titleMedium
                )
                Spacer(modifier = Modifier.height(10.dp))
                Text(
                    text = "Pancode is a code editor developed to make technology easier for people to access. " +
                            "Conventional code editors can only be accessed on a PC, some people don't have a PC. " +
                            "That's why we build Pancode.",
                    style = MaterialTheme.typography.bodyMedium,
                    textAlign = TextAlign.Justify
                )
            }
            ButtonMedium(
                onClick = onConfirm,
                text = "Loremo"
            )
        }
    }
}

@Preview
@Composable
fun WelcomeDialogPreview() {
    PancodeTheme {
        WelcomeDialog {  }
    }
}