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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.CodeEditor
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.code_editor.CodeEditorScreen
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.drawer_menu.DrawerMenu
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.main_menu.MainMenu
import net.letmethingk.pancode.presentation.ui.common.components.IconButton24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.path_menu.PathMenu
import net.letmethingk.pancode.presentation.ui.common.components.Taskbar
import net.letmethingk.pancode.presentation.ui.common.compose_vectors.defic24

/*
 * Workspace screen
 * the main screen that will be displayed at the beginning
 * */
@Composable
fun WorkspaceScreen(modifier: Modifier = Modifier) {

    val viewModel: WorkspaceViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

//    Workspace screen composable
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceDim),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Topbar(viewModel)
        TaskbarMenu(viewModel)
        when (val content = uiState.selectedContentTab) {
            is CodeEditor -> {
                CodeEditorScreen(
                    textFiledState = content.textFieldState,
                    filePathList = content.filePathList
                )
            }
            else -> null
        }

    }
    MainMenu(isShow = uiState.selectedMenu == MenuList.MainMenu) {
        viewModel.switchMenu(null)
        viewModel.switchMainMenu(null)
    }
    PathMenu(isShow = uiState.selectedMenu == MenuList.PathMenu) {
        viewModel.switchMenu(null)
    }
    DrawerMenu(isShow = uiState.selectedMenu == MenuList.DrawerMenu) {
        viewModel.switchMenu(null)
    }
}

@Composable
fun TaskbarMenu(viewModel: WorkspaceViewModel = viewModel()) {

    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

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

        uiState.contentTabList.forEachIndexed { index, content ->
            Taskbar(
                fileName = content.contentName,
                onClose = { viewModel.removeContent(index) },
                onClick = { viewModel.setContent(content) }
            )
        }
    }
}

@Composable
fun Topbar(viewModel: WorkspaceViewModel = viewModel()) {

//    val selectedMenu by viewModel.selectedMenu.collectAsStateWithLifecycle()
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
                    viewModel.switchMenu(MenuList.DrawerMenu) },
                imageVector = defic24,
                contentDescription = "drawer-menu"
            )
            Spacer(modifier = Modifier.width(25.dp))
//                File Path menu title button
            Row(modifier = Modifier.clickable(
                onClick = { viewModel.switchMenu(MenuList.PathMenu) })) {
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
            onClick = {
                viewModel.switchMenu(MenuList.MainMenu);
                viewModel.addContent(CodeEditor("coba"))
            },
            imageVector = defic24,
            contentDescription = "main-menu"
        )
    }
}

@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    PancodeTheme {
        WorkspaceScreen()
    }
}