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
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composables.defic24
import net.letmethingk.pancode.ui.components.CustomMainMenu
import net.letmethingk.pancode.ui.components.DrawerMenu
import net.letmethingk.pancode.ui.components.reusable.Overlay
import net.letmethingk.pancode.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.components.reusable.Submenu
import net.letmethingk.pancode.ui.components.reusable.TransparentOverlay
import net.letmethingk.pancode.ui.theme.PancodeTheme

/*
 * Workspace screen
 * the main screen that will be displayed at the beginning
 * */
@Composable
fun WorkspaceScreen(modifier: Modifier = Modifier) {
//    This state determines what is active and displays the option menus
    val showOpt = remember { mutableStateListOf(true, false, false, false) }
//    Workspace screen composable
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
                    onClick = {
                        showOpt[3] = !showOpt[3]
                    },
                    imageVector = defic24,
                    contentDescription = "drawer-menu"
                )
                Spacer(modifier = Modifier.width(25.dp))
                Row(modifier = Modifier.clickable(onClick = {
                    showOpt[2] = !showOpt[2]
                })) {
                    Icon(
                        imageVector = defic24,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(
                        text = "Pancode",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
            IconButton24(
                onClick = {
                    showOpt[1] = !showOpt[1]
                },
                imageVector = defic24,
                contentDescription = "main-menu"
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
//    Main menu
    TransparentOverlay(
        onClick = { showOpt[1] = false },
        isShowAnimate = showOpt[1]
    ) {
        CustomMainMenu(
            modifier = Modifier.offset(x = 71.dp, y = 55.dp)
        )
    }
//    Path menu
    TransparentOverlay(
        onClick = { showOpt[2] = false },
        isShowAnimate = showOpt[2]
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
//    Drawer menu
    Overlay(
        onClick = { showOpt[3] = false },
        isShowAnimate = showOpt[3],
        alignment = Alignment.TopStart
    ) {
        DrawerMenu(isShowAnimate = showOpt[3])
    }
}


@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    PancodeTheme {
        WorkspaceScreen()
    }
}