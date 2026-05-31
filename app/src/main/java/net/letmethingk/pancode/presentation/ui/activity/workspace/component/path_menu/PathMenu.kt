package net.letmethingk.pancode.presentation.ui.activity.workspace.component.path_menu

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.common.widgets_component.CleanOverlay
import net.letmethingk.pancode.presentation.ui.common.widgets_component.DropdownMenuButton
import net.letmethingk.pancode.presentation.ui.common.widgets_component.Submenu

@Composable
fun PathMenu(isShow: Boolean, onClick: () -> Unit) {
    val pathMenuList = listOf("Open...", "Close folder")
    CleanOverlay(onClick = onClick, isShow = isShow) {
        Submenu(modifier = Modifier.offset(x = 65.dp, y = 75.dp)) {
            pathMenuList.forEach { menu ->
                DropdownMenuButton(
                    onClick = {
                        when (menu) {
                            pathMenuList[0] -> {  }
                            pathMenuList[1] -> {  }
                        }
                    },
                    text = menu
                )
            }
        }
    }
}