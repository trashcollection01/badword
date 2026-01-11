package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.presentation.ui.components.reusable.Overlay
import net.letmethingk.pancode.presentation.ui.components.reusable.Submenu
import net.letmethingk.pancode.presentation.ui.components.reusable.TransparentOverlay
import net.letmethingk.pancode.presentation.ui.workspace.component.CustomMainMenu
import net.letmethingk.pancode.presentation.ui.workspace.component.DrawerMenu

class MenuDisplayed {
//    The menu that will be displayed when clicked
//    Main menu
    @Composable
    fun MainMenuDisplay() {
        TransparentOverlay(onClick = { /*showOpt[1] = false*/ }) {
            CustomMainMenu(modifier = Modifier.offset(x = 71.dp, y = 55.dp))
        }
    }
//    Path menu
    @Composable
    fun PathMenuDisplay() {
        TransparentOverlay(onClick = { /*showOpt[2] = false*/ }) {
            Submenu(modifier = Modifier.offset(x = 65.dp, y = 55.dp)) {
                DropdownMenuButton(
                    onClick = {},
                    text = "Open..."
                )
                DropdownMenuButton(
                    onClick = {},
                    text = "Close folder"
                )
            }
        }
    }
//    Drawer menu
    @Composable
    fun  DrawerMenuDisplay() {
        Overlay(
            onClick = { /*showOpt[3] = false*/ },
            isShowAnimate = false/*showOpt[3]*/,
            alignment = Alignment.TopStart
        ) { DrawerMenu(isShowAnimate = false/*showOpt[3]*/) }
    }
}