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

/*
 * Main Menu
 * this is to usage in the workspace.
 * there are many display functions here,
 * like display main menu and submenu.
 * */
@Composable
fun CustomMainMenu(modifier: Modifier = Modifier) {
//    This int state determines what is active and display the menu
    var showSubmenu by remember { mutableStateOf<Int?>(null) }
    Row (
        modifier = modifier
            .width(325.dp)
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.End
    ) {
//        This is to validate based on int number and display the menu
        when (showSubmenu) {
            1 -> FileSubmenu()
            2 -> EditSubmenu()
            3 -> SelectionSubmenu()
            4 -> ViewSubmenu()
            5 -> RunSubmenu()
            6 -> TerminalSubmenu()
            7 -> SettingsSubmenu()
            8 -> HelpSubmenu()
        }
        Spacer(modifier = Modifier.width(5.dp))
//        this is func to wrap up the DropdownMenuButton() to be 1 menu
        Menu() {
            DropdownMenuButton(
                onClick = { showSubmenu = 1 },
                text = "File"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 2 },
                text = "Edit"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 3 },
                text = "Selection"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 4 },
                text = "View"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 5},
                text = "Run"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 6 },
                text = "Terminal"
            )
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
                color = MaterialTheme.colorScheme.outline
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 7 },
                text = "Settings"
            )
            DropdownMenuButton(
                onClick = { showSubmenu = 8 },
                text = "Help"
            )
        }
    }
}

//    Submenu
@Composable
fun FileSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 0.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "1"
        )
    }
}
@Composable
fun EditSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 35.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "2"
        )
    }
}
@Composable
fun SelectionSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 70.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "3"
        )
    }
}
@Composable
fun ViewSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 105.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "4"
        )
    }
}
@Composable
fun RunSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 140.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "5"
        )
    }
}
@Composable
fun TerminalSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 175.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "6"
        )
    }
}
@Composable
fun SettingsSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 221.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "7"
        )
    }
}
@Composable
fun HelpSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 256.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "8"
        )
    }
}

@Preview()
@Composable
fun MainMenuPreview() {
    PancodeTheme {
        CustomMainMenu()
    }
}
