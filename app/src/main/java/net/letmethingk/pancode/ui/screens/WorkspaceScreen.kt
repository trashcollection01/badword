package net.letmethingk.pancode.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.composables.defic24
import net.letmethingk.pancode.ui.components.BreadcrumbPath
import net.letmethingk.pancode.ui.components.CustomMainMenu
import net.letmethingk.pancode.ui.components.Overlay
import net.letmethingk.pancode.ui.components.TransparentOverlay
import net.letmethingk.pancode.ui.components.reusable.ButtonMedium
import net.letmethingk.pancode.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.components.reusable.Submenu
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun WorkspaceScreen(
    modifier: Modifier = Modifier
) {
    var showMenuBreadCrumbs by remember { mutableStateOf(false) }
    var showWelcomeDialog by remember { mutableStateOf(true) }
    var showMainMenu by remember { mutableStateOf(false) }
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceDim),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = MaterialTheme.colorScheme.surface)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                IconButton24(
                    onClick = {},
                    imageVector = defic24,
                    contentDescription = "drawer-menu"
                )
                Spacer(modifier = Modifier.width(25.dp))
                BreadcrumbPath(
                    onClick = { showMenuBreadCrumbs = !showMenuBreadCrumbs },
                    isShow = showMenuBreadCrumbs
                )
            }
//            TransparentOverlay()
            IconButton24(
                onClick = { showMainMenu = !showMainMenu },
                imageVector = defic24,
                contentDescription = ""
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
        ) {

        }
    }
    if (showMainMenu) {
        TransparentOverlay(onClick = { showMainMenu = false }) {
            CustomMainMenu(
                modifier = Modifier.offset(x = 71.dp, y = 74.dp)
            )
        }
    }
    if (showMenuBreadCrumbs) {
        TransparentOverlay(onClick = {
            showMenuBreadCrumbs = false
        }) {
            Submenu(
                content = {
                    DropdownMenuButton(
                        onClick = {},
                        text = "Open..."
                    )
                    DropdownMenuButton(
                        onClick = {},
                        text = "Close folder"
                    )
                },
                modifier = Modifier.offset(x = 65.dp, y = 74.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    PancodeTheme {
        WorkspaceScreen()
    }
}