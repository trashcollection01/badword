package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.mainmenu.MainMenuList
import net.letmethingk.pancode.presentation.ui.common.components.TaskbarClass

class WorkspaceViewModel : ViewModel(){
//    Taskbar state list
    val listTaskBar = mutableStateListOf<TaskbarClass>()

//    Selected Menu to view Submenu
    private val _selectedMainMenu = MutableStateFlow<MainMenuList?>(null)
    val selectedMainMenu = _selectedMainMenu.asStateFlow() // Get value StateFlow

//    Selected Menu to view Menu
    private val _selectedMenu = MutableStateFlow<MenuList?>(null)
    val selectedMenu: StateFlow<MenuList?> = _selectedMenu.asStateFlow() // Get value StateFlow

//    Set value selected Menu
    fun switchMenu(menu: MenuList?) {
        _selectedMenu.value = menu
    }
//    Set value selected MainMenu
    fun switchMainMenu(mainMenu: MainMenuList?) {
        _selectedMainMenu.value = mainMenu
    }

}