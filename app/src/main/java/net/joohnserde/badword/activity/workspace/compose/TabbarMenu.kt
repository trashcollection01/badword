package net.joohnserde.badword.activity.workspace.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.workspace.WorkspaceViewModel
import net.joohnserde.badword.core.ui.reusable.widgets.Tabbar

@Composable
fun TabbarMenu() {

    val viewModel: WorkspaceViewModel = viewModel()
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
            Tabbar(
                fileName = content.contentName,
                onClose = { viewModel.removeContent(index) },
                onClick = { viewModel.setContent(index) }
            )
        }
    }
}