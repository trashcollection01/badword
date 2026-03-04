package net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.activity.workspace.WorkspaceViewModel
import net.letmethingk.pancode.presentation.ui.components.reusable.Taskbar

@Composable
fun TaskbarMenu(viewModel: WorkspaceViewModel = viewModel()) {
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
            Taskbar(
                fileName = name,
                onClose = { viewModel.listTaskBar.removeAt(number) }
            ) {  }
        }
    }
}