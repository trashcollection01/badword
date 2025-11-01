package net.letmethingk.pancode.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.composables.defic24
import net.letmethingk.pancode.ui.components.MainMenu
import net.letmethingk.pancode.ui.components.reusable.ButtonMedium
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun WorkspaceScreen(
    modifier: Modifier = Modifier
) {
    var showWelcomeDialog by remember { mutableStateOf(true) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceDim),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = MaterialTheme.colorScheme.surface)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                IconButton24(
                    onClick = {},
                    imageVector = defic24,
                    contentDescription = "drawer-menu"
                )
                Spacer(modifier = Modifier.width(15.dp))
                Row() {
                    Icon(
                        imageVector = defic24,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(
                        text = "Pancode",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
            MainMenu()
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
        ) {

        }
    }
//    if (showWelcomeDialog) {
//        WelcomeDialog(onConfirm = { showWelcomeDialog = false })
//    }
}

@Composable
fun WelcomeDialog(
    onConfirm: () -> Unit
) {
    Dialog(
        onDismissRequest = { onConfirm }
    ) {
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

@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    PancodeTheme {
        WorkspaceScreen()
    }
}