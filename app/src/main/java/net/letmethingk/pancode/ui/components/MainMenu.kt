package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.*
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.composables.defic24
import net.letmethingk.pancode.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.components.reusable.Menu
import net.letmethingk.pancode.ui.components.reusable.Submenu
import net.letmethingk.pancode.ui.theme.PancodeTheme
import net.letmethingk.pancode.ui.theme.ShadowColor

@Composable
fun CustomMainMenu(
    modifier: Modifier = Modifier
) {
    var showSubmenu by remember { mutableStateOf<String?>(null) }
    Row (
        modifier = modifier
            .width(325.dp)
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.End
    ) {
        when (showSubmenu) {
            "File" -> FileSubmenu()
            "Edit" -> EditSubmenu()
            "Selection" -> SelectionSubmenu()
            "View" -> ViewSubmenu()
            "Run" -> RunSubmenu()
            "Terminal" -> TerminalSubmenu()
            "Settings" -> SettingsSubmenu()
            "Help" -> HelpSubmenu()
        }
        Spacer(modifier = Modifier.width(5.dp))
        Menu(
            content = {
                DropdownMenuButton(
                    onClick = { showSubmenu = "File" },
                    text = "File"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Edit" },
                    text = "Edit"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Selection" },
                    text = "Selection"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "View" },
                    text = "View"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Run" },
                    text = "Run"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Terminal" },
                    text = "Terminal"
                )
                HorizontalDivider(
                    modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
                    color = MaterialTheme.colorScheme.outline
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Settings" },
                    text = "Settings"
                )
                DropdownMenuButton(
                    onClick = { showSubmenu = "Help" },
                    text = "Help"
                )
            }
        )
    }
}

@Composable
fun FileSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "1"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 0.dp)
    )
}
@Composable
fun EditSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "2"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 35.dp)
    )
}
@Composable
fun SelectionSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "3"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 70.dp)
    )
}
@Composable
fun ViewSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "4"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 105.dp)
    )
}
@Composable
fun RunSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "5"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 140.dp)
    )
}
@Composable
fun TerminalSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "6"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 175.dp)
    )
}
@Composable
fun SettingsSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "7"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 221.dp)
    )
}
@Composable
fun HelpSubmenu() {
    Submenu(
        content = {
            DropdownMenuButton(
                onClick = {},
                text = "8"
            )
        },
        modifier = Modifier.offset(x = 0.dp, y = 256.dp)
    )
}

@Preview()
@Composable
fun MainMenuPreview() {
    PancodeTheme {
        CustomMainMenu()
    }
}
