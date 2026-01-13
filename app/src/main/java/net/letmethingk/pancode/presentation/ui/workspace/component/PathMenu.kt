package net.letmethingk.pancode.presentation.ui.workspace.component

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.CleanOverlay
import net.letmethingk.pancode.presentation.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.presentation.ui.components.reusable.Submenu

enum class PathMenuList(val menuName: String, val onClick: () -> Unit) {
    OPENOPS(menuName = "Open...", onClick = {

    }),
    CFOLDER(menuName = "Close folder", onClick = {

    })
}

@Composable
fun PathMenu(
    isShow: Boolean,
    onClick: () -> Unit
) {
    CleanOverlay(
        onClick = onClick,
        isShow = isShow
    ) {
        Submenu(modifier = Modifier.offset(x = 65.dp, y = 55.dp)) {
            PathMenuList.entries.forEach { menu ->
                DropdownMenuButton(
                    onClick = menu.onClick,
                    text = menu.menuName
                )
            }
        }
    }
}