package net.joohnserde.badword.activity.workspace.feature.main_menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.workspace.WorkspaceViewModel
import net.joohnserde.badword.core.ui.reusable.widgets.CleanOverlay
import net.joohnserde.badword.core.ui.reusable.widgets.DropdownMenuButton
import net.joohnserde.badword.core.ui.reusable.widgets.Menu
import net.joohnserde.badword.core.ui.reusable.widgets.Submenu

/*
 * Main Menu
 * this is to usage in the workspace.
 * there are many display functions here,
 * like display main menu and submenu.
 * */
@Composable
fun MainMenu(isShow: Boolean, onClick: () -> Unit) {

//    This int state determines what is active and display the menu
    val viewModel: WorkspaceViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    CleanOverlay(onClick = onClick, isShow = isShow) {

        Row(
            modifier = Modifier
                .width(325.dp)
                .wrapContentHeight()
                .offset(x = 75.dp, y = 75.dp),
            horizontalArrangement = Arrangement.End
        ) {

//            This is to validate based on int number and display the menu
            when (uiState.selectedMainMenu) {
                MainMenuList.FILE -> FileSubmenu()
                MainMenuList.EDIT -> EditSubmenu()
                MainMenuList.SELECTION -> SelectionSubmenu()
                MainMenuList.VIEW -> ViewSubmenu()
                MainMenuList.RUN -> RunSubmenu()
                MainMenuList.TERMINAL -> TerminalSubmenu()
                MainMenuList.SETTINGS -> SettingsSubmenu()
                MainMenuList.HELP -> HelpSubmenu()
                else -> {}
            }

            Spacer(modifier = Modifier.width(5.dp))

//            this is func to wrap up the DropdownMenuButton() to be 1 menu
            Menu() {
                MainMenuList.entries.forEach { menu ->
                    DropdownMenuButton(
                        text = menu.nameMenu,
                        onClick = {
                            viewModel.switchMainMenu(menu)
                        }
                    )
                }
            }
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
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 210.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "7"
        )
    }
}
@Composable
fun HelpSubmenu() {
    Submenu(modifier = Modifier.offset(x = 0.dp, y = 245.dp)) {
        DropdownMenuButton(
            onClick = {},
            text = "8"
        )
    }
}