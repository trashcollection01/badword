package net.letmethingk.pancode.presentation.ui.common.widgets_component

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.common.compose_vectors.defic24

@Preview
@Composable
fun SearchBar(
    width: Float = 0.92f
) {
    OutlinedTextField(
        state = rememberTextFieldState(),
        lineLimits = TextFieldLineLimits.SingleLine,
        modifier = Modifier
            .height(45.dp)
            .fillMaxWidth(width),
        contentPadding = PaddingValues(15.dp),
        textStyle = MaterialTheme.typography.bodyLarge,
        placeholder = { Text("Search") },
        shape = RoundedCornerShape(15.dp),
        prefix = {
            Icon(
                modifier = Modifier.padding(end = 5.dp),
                imageVector =
                    defic24,
                contentDescription = "search"
            )
        }
    )
}