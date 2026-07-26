package net.joohnserde.badword.activity.workspace.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.skydoves.compose.stability.runtime.TraceRecomposition
import net.joohnserde.badword.activity.workspace.feature.code_editor.compose.CodeEditorCompose
import net.joohnserde.badword.activity.workspace.feature.code_editor.model.CodeEditor
import net.joohnserde.badword.activity.workspace.feature.content_tab.model.Content

@Composable
fun ContentShow(
    content: Content?,
    contentIsEmpty: Boolean
) {

    if (!contentIsEmpty) {
        when (content) {
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
    }
}