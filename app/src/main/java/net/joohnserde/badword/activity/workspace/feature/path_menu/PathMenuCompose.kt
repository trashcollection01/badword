package net.joohnserde.badword.activity.workspace.feature.path_menu

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.joohnserde.badword.activity.workspace.MenuList
import net.joohnserde.badword.activity.workspace.WorkspaceUiState
import net.joohnserde.badword.activity.workspace.WorkspaceViewModel
import net.joohnserde.badword.core.ui.reusable.widgets.CleanOverlay
import net.joohnserde.badword.core.ui.reusable.widgets.DropdownMenuButton
import net.joohnserde.badword.core.ui.reusable.widgets.Submenu

@Composable
fun PathMenuCompose(uiState: WorkspaceUiState, viewModel: WorkspaceViewModel) {
    val pathMenuList = listOf("Open...", "Close folder")
    CleanOverlay(
        onClick = { viewModel.switchMenu(null) },
        isShow = uiState.selectedMenu == MenuList.PathMenu
    ) {
        Submenu(modifier = Modifier.offset(x = 65.dp, y = 75.dp)) {
            pathMenuList.forEach { menu ->
                DropdownMenuButton(
                    onClick = {
                        when (menu) {
                            pathMenuList[0] -> {

                            }
                            pathMenuList[1] -> {

                            }
                        }
                    },
                    text = menu
                )
            }
        }
    }
}