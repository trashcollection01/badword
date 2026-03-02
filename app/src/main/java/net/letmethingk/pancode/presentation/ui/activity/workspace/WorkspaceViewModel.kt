package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.rememberNavBackStack
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar.TaskbarClass

class WorkspaceViewModel : ViewModel(){
    val listTaskBar = mutableStateListOf<TaskbarClass>()
}