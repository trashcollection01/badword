package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.presentation.ui.components.reusable.Overlay
import net.letmethingk.pancode.presentation.ui.components.reusable.Submenu
import net.letmethingk.pancode.presentation.ui.components.reusable.CleanOverlay
import net.letmethingk.pancode.presentation.ui.workspace.component.CustomMainMenu
import net.letmethingk.pancode.presentation.ui.workspace.component.DrawerMenu

class MenuDisplayed {
//    The menu that will be displayed when clicked
//    Main menu
    @Composable
    fun MainMenuDisplay(
        isShow: Boolean,
        onClick: () -> Unit
) {
        CleanOverlay(
            onClick = onClick,
            isShow = isShow
        ) {
            CustomMainMenu(
                modifier = Modifier.offset(x = 71.dp, y = 55.dp)
            )
        }
    }
//    Path menu
    @Composable
    fun PathMenuDisplay(
        isShow: Boolean,
        onClick: () -> Unit
) {
        CleanOverlay(
            onClick = onClick,
            isShow = isShow
        ) {
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
    fun DrawerMenuDisplay(
        isShow: Boolean,
        onClick: () -> Unit
    ) {
        Overlay(
            onClick = onClick,
            isShowAnimate = isShow,
            alignment = Alignment.TopStart
        ) { }
        DrawerMenu(isShowAnimate = isShow)
    }
}