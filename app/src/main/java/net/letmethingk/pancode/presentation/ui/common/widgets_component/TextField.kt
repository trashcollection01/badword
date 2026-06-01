package net.letmethingk.pancode.presentation.ui.common.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CustomTextField(input: TextFieldState, label: String) {
    BasicTextField(
        state = input,
        modifier = Modifier
            .width(340.dp)
            .wrapContentHeight(),
        enabled = true,
        textStyle = MaterialTheme.typography.bodyLarge.copy(
            color = if (isSystemInDarkTheme()) Color.White else Color.Black
        ),
        lineLimits = TextFieldLineLimits.SingleLine,
        decorator = { innerTextField ->
            Column {
                Text(
                    text = label,
                    style = MaterialTheme.typography.labelSmall
                )
                Spacer(modifier = Modifier.height(8.dp))
                innerTextField()
                Spacer(modifier = Modifier.height(5.dp))
                HorizontalDivider(
                    thickness = 3.dp,
                    color = MaterialTheme.colorScheme.outline
                )
            }
        }
    )
}
