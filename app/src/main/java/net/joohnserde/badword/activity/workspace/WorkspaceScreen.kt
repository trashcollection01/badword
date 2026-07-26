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
import net.joohnserde.badword.activity.workspace.compose.ContentShow
import net.joohnserde.badword.activity.workspace.compose.TabbarMenu
import net.joohnserde.badword.activity.workspace.compose.TopbarMenu
import net.joohnserde.badword.activity.workspace.feature.code_editor.model.CodeEditor
import net.joohnserde.badword.activity.workspace.feature.code_editor.compose.CodeEditorCompose
import net.joohnserde.badword.activity.workspace.feature.code_editor.code
import net.joohnserde.badword.activity.workspace.feature.drawer_menu.DrawerMenu
import net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenu
import net.joohnserde.badword.activity.workspace.feature.path_menu.PathMenu
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

//    Workspace screen composable
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceDim),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        TopbarMenu()

        TabbarMenu()

        ContentShow(
            content = uiState.contentList.getOrNull(uiState.selectedContent),
            contentIsEmpty = uiState.contentList.isEmpty()
        )

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

@Preview(showBackground = true)
@Composable
fun WorkspacePreview() {
    BadwordTheme {
        WorkspaceScreen()
    }
}