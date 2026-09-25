package net.joohnserde.badword.presentation.workspace.compose_component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.joohnserde.badword.presentation.common.reusable.widgets.CleanOverlay
import net.joohnserde.badword.presentation.common.reusable.widgets.DropdownMenuButton
import net.joohnserde.badword.presentation.common.reusable.widgets.Menu
import net.joohnserde.badword.presentation.common.reusable.widgets.Submenu
import net.joohnserde.badword.domain.workspace.model.MenuList
import net.joohnserde.badword.presentation.workspace.WorkspaceUiState
import net.joohnserde.badword.presentation.workspace.WorkspaceViewModel

/*
 * Main Menu
 * this is to usage in the workspace.
 * there are many display functions here,
 * like display main menu and submenu.
 * */
@Composable
fun MainMenuCompose(uiState: WorkspaceUiState, viewModel: WorkspaceViewModel) {

    CleanOverlay(
        onClick = {
            viewModel.switchMenu(null)
            viewModel.switchMainMenu(null)
        },
        isShow = uiState.selectedMenu == MenuList.MainMenu
    ) {

        Row(
            modifier = Modifier
                .width(325.dp)
                .wrapContentHeight()
                .offset(x = 75.dp, y = 75.dp),
            horizontalArrangement = Arrangement.End
        ) {
            if (uiState.selectedMainMenu != null)
                uiState.mainMenuList[uiState.selectedMainMenu].apply {
                    Submenu(modifier = Modifier.offset(x = 0.dp, y = (id * 35).dp)) {
                        submenuList.forEach { submenu ->
                            DropdownMenuButton(
                                onClick = submenu.onClick,
                                text = submenu.nameMenu
                            )
                        }
                    }
                }

            Spacer(modifier = Modifier.width(5.dp))

//            this is func to wrap up the DropdownMenuButton() to be 1 menu
            Menu() {
                uiState.mainMenuList.forEach { menu ->
                    DropdownMenuButton(
                        text = menu.nameMenu,
                        onClick = {
                            viewModel.switchMainMenu(menu.id)
                        }
                    )
                }
            }
        }
    }
}