package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
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
import androidx.lifecycle.ViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.activity.code_editor.CodeEditorScreen
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.DrawerMenu
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.MainMenu
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar.TaskbarClass
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.components.reusable.IconButton24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme
import net.letmethingk.pancode.presentation.ui.workspace.component.PathMenu
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar.TaskbarFile

/*
 * Workspace screen
 * the main screen that will be displayed at the beginning
 * */
@Composable
fun WorkspaceScreen(
    modifier: Modifier = Modifier,
    viewModel: WorkspaceViewModel = viewModel()
) {
    val selectedMenu by viewModel.selectedMenu.collectAsStateWithLifecycle()
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
//                Drawer menu icon button
                IconButton24(
                    onClick = {
                        viewModel.switchMenu(Menu.DrawerMenu) },
                    imageVector = defic24,
                    contentDescription = "drawer-menu"
                )
                Spacer(modifier = Modifier.width(25.dp))
//                File Path menu title button
                Row(modifier = Modifier.clickable(
                    onClick = { viewModel.switchMenu(Menu.PathMenu) })) {
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
//            Main menu icon button
            IconButton24(
                onClick = {viewModel.switchMenu(Menu.MainMenu); viewModel.listTaskBar.add(
                    TaskbarClass(0, "lamboIndex.php")
                )},
                imageVector = defic24,
                contentDescription = "main-menu"
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
                .horizontalScroll(
                    state = rememberScrollState(),
                    overscrollEffect = null
                )
        ) {
            viewModel.listTaskBar.forEach { (number, name) ->
                TaskbarFile(
                    fileName = name,
                    onClose = { viewModel.listTaskBar.removeAt(number) }
                ) {  }
            }
        }
        CodeEditorScreen()
    }
    MainMenu(isShow = selectedMenu == Menu.MainMenu) {
        viewModel.switchMenu(null)
    }
    PathMenu(isShow = selectedMenu == Menu.PathMenu) {
        viewModel.switchMenu(null)
    }
    DrawerMenu(isShow = selectedMenu == Menu.DrawerMenu) {
        viewModel.switchMenu(null)
    }
}

@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    PancodeTheme {
        WorkspaceScreen()
    }
}