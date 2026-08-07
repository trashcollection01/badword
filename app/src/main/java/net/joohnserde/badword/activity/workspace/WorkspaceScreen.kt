package net.joohnserde.badword.activity.workspace

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
import androidx.compose.foundation.text.input.TextFieldState
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
import net.joohnserde.badword.activity.workspace.feature.code_editor.code
import net.joohnserde.badword.activity.workspace.feature.code_editor.compose.CodeEditorCompose
import net.joohnserde.badword.activity.workspace.feature.code_editor.model.CodeEditor
import net.joohnserde.badword.activity.workspace.feature.drawer_menu.DrawerMenu
import net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenuCompose
import net.joohnserde.badword.activity.workspace.feature.path_menu.PathMenuCompose
import net.joohnserde.badword.core.ui.reusable.vectors.defic24
import net.joohnserde.badword.core.ui.reusable.widgets.IconButton24
import net.joohnserde.badword.core.ui.reusable.widgets.Tabbar
import net.joohnserde.badword.core.ui.theme.BadwordTheme

/*
 * Workspace screen
 * the main screen that will be displayed at the beginning
 * */
@Composable
fun WorkspaceScreen(modifier: Modifier = Modifier) {

    val viewModel: WorkspaceViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    Column( // Workspace screen composable
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceDim),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row( // Topbar menu
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .background(color = MaterialTheme.colorScheme.surface)
                .padding(horizontal = 15.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row {
                IconButton24( // Drawer menu icon button
                    onClick = {
                        viewModel.switchMenu(MenuList.DrawerMenu) },
                    imageVector = defic24,
                    contentDescription = "drawer-menu"
                )
                Spacer(modifier = Modifier.width(25.dp))
                Row( // File Path menu title button
                    modifier = Modifier.clickable(
                        onClick = { viewModel.switchMenu(MenuList.PathMenu) })) {
                            Icon(
                                imageVector = defic24,
                                contentDescription = null
                            )
                    Spacer(modifier = Modifier.width(7.dp))
                    Text(
                        text = "Badword",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
            }
            IconButton24( // Main menu icon button
                onClick = {
                    viewModel.switchMenu(MenuList.MainMenu);
                    viewModel.addContent(CodeEditor("coba", textFieldState = TextFieldState(code)))
                },
                imageVector = defic24,
                contentDescription = "main-menu"
            )
        } // END Topbar menu

        Row( // Tabbar menu
            modifier = Modifier
                .fillMaxWidth()
                .height(35.dp)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
                .horizontalScroll(
                    state = rememberScrollState(),
                    overscrollEffect = null
                )
        ) {
            uiState.contentList.forEachIndexed { index, content ->
                Tabbar(
                    fileName = content.contentName,
                    isSelected = uiState.selectedContent == index,
                    onClose = { viewModel.removeContent(index) },
                    onClick = { viewModel.setContent(index) }
                )
            }
        } // END Tabbar menu

        // Content tab
        if (!uiState.contentList.isEmpty()) {
            when (val content = uiState.contentList.getOrNull(uiState.selectedContent)) {
                is CodeEditor -> {
                    CodeEditorCompose(
                        textFiledState = content.textFieldState,
                        filePath = content.filePath
                    )
                }
            }
        } else {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) { Text("Content Not Found!") }
        } // END Content tab

    } // END Workspace screen composable

    MainMenuCompose(uiState = uiState, viewModel = viewModel)

    PathMenuCompose(uiState = uiState, viewModel = viewModel)

    DrawerMenu(isShow = uiState.selectedMenu == MenuList.DrawerMenu) {
        viewModel.switchMenu(null)
    }
}

@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    BadwordTheme {
        WorkspaceScreen()
    }
}