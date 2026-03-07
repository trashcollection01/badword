package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.mainmenu.MainMenuList
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.taskbar.TaskbarClass

class WorkspaceViewModel : ViewModel(){
    val listTaskBar = mutableStateListOf<TaskbarClass>()
    private val _selectedMainMenu = MutableStateFlow<MainMenuList?>(null)
    val selectedMainMenu = _selectedMainMenu.asStateFlow()
    private val _selectedMenu = MutableStateFlow<MenuList?>(null)
    val selectedMenu: StateFlow<MenuList?> = _selectedMenu.asStateFlow()

    fun switchMenu(menu: MenuList?) {
        _selectedMenu.value = menu
    }
    fun switchMainMenu(mainMenu: MainMenuList?) {
        _selectedMainMenu.value = mainMenu
    }

}