package net.joohnserde.badword.activity.workspace.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.workspace.WorkspaceViewModel
import net.joohnserde.badword.activity.workspace.feature.code_editor.compose.CodeEditorCompose
import net.joohnserde.badword.activity.workspace.feature.code_editor.model.CodeEditor

@Composable
fun ContentShow() {

    val viewModel: WorkspaceViewModel = viewModel()
    val uiState by viewModel.uiState.collectAsStateWithLifecycle()

    if (!uiState.contentTabList.isEmpty()) {
        when (val content = uiState.selectedContentTab) {
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
        ) {
            Text("Content Not Found!")
        }
    }
}