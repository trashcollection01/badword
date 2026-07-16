package net.letmethingk.pancode.activity.workspace.feature.path_menu

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.core.ui.reusable.widgets.CleanOverlay
import net.letmethingk.pancode.core.ui.reusable.widgets.DropdownMenuButton
import net.letmethingk.pancode.core.ui.reusable.widgets.Submenu

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