package net.letmethingk.pancode.presentation.ui.activity.workspace

import android.widget.Switch
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.rememberNavBackStack
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar.TaskbarClass

class WorkspaceViewModel : ViewModel(){
    val listTaskBar = mutableStateListOf<TaskbarClass>()
    private val _selectedMenu = MutableStateFlow<Menu?>(null)
    val selectedMenu: StateFlow<Menu?> = _selectedMenu.asStateFlow()

    fun switchMenu(menu: Menu?) {
        _selectedMenu.value = menu
    }
}