package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import net.letmethingk.pancode.ui.components.reusable.ButtonMedium
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun WelcomeDialog(onConfirm: () -> Unit) {
    Column(
        modifier = Modifier
            .width(325.dp)
            .height(350.dp)
            .background(
                color = MaterialTheme.colorScheme.surface,
                shape = RoundedCornerShape(25.dp)
            )
            .padding(20.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            Text(
                text = "Pancode v1.0",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "Code anytime, anywhere — right from your mobile device.",
                style = MaterialTheme.typography.titleMedium,
                textAlign = TextAlign.Justify,
            )
            Spacer(modifier = Modifier.height(15.dp))
            Text(
                text = "See the update",
                style = MaterialTheme.typography.labelSmall,
                textDecoration = TextDecoration.Underline

            )
        }
        ButtonMedium(
            onClick = onConfirm,
            text = "Loremo"
        )
    }
}

@Preview(showBackground = false)
@Composable
fun WelcomeDialogPreview() {
    PancodeTheme {
        WelcomeDialog({})
    }
}