package net.letmethingk.pancode.ui.components.reusable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composables.defic12
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun TaskbarFile(
    fileName: String,
    onClick: () -> Unit
) {
    Row(
        modifier = Modifier
            .clickable(onClick = onClick)
            .defaultMinSize(minWidth = 100.dp)
            .height(35.dp)
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
            .padding(horizontal = 9.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Icon(
                imageVector = defic12,
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(width = 5.dp))
            Text(
                text = fileName,
                style = MaterialTheme.typography.labelMedium
            )
        }
        Spacer(modifier = Modifier.width(width = 8.dp))
        Icon(
            imageVector = defic12,
            contentDescription = ""
        )
    }
}

@Preview
@Composable
fun PreviewTaskbar() {
    PancodeTheme {
        TaskbarFile("main.cpp", {})
    }
}