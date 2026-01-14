package net.letmethingk.pancode.presentation.ui.workspace.component

import androidx.compose.foundation.layout.offset
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.components.reusable.CleanOverlay
import net.letmethingk.pancode.presentation.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.presentation.ui.components.reusable.Submenu

@Composable
fun PathMenu(isShow: Boolean, onClick: () -> Unit) {
    val pathMenuList = listOf("Open...", "Close folder")
    CleanOverlay(onClick = onClick, isShow = isShow) {
        Submenu(modifier = Modifier.offset(x = 65.dp, y = 55.dp)) {
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