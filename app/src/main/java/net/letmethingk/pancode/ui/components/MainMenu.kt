package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composables.defic24
import net.letmethingk.pancode.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun MainMenu() {
    var expandedMainMenu by remember { mutableStateOf(true) }
    Box {
        IconButton24(
            onClick = { expandedMainMenu = !expandedMainMenu },
            imageVector = defic24,
            contentDescription = ""
        )
        DropdownMenu(
            expanded = expandedMainMenu,
            onDismissRequest = { expandedMainMenu = false },
            modifier = Modifier
                .width(120.dp)
                .padding(
                    vertical = 0.dp,
                    horizontal = 0.dp
                ),
        ) {
            DropdownMenuButton(
                onClick = {},
                text = "File"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Edit"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Selection"
            )
            DropdownMenuButton(
                onClick = {},
                text = "View"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Run"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Terminal"
            )
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 5.dp),
                color = MaterialTheme.colorScheme.outlineVariant
            )
            DropdownMenuButton(
                onClick = {},
                text = "Settings"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Help"
            )
        }
    }
}

@Preview
@Composable
fun MainMenuPreview() {
    PancodeTheme {
        MainMenu()
    }
}
