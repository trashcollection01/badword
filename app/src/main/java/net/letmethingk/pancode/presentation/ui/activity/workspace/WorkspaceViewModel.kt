package net.letmethingk.pancode.presentation.ui.activity.workspace

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.Content
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.mainmenu.MainMenuList
import net.letmethingk.pancode.presentation.ui.common.components.TaskbarClass

class WorkspaceViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(WorkspaceUiState())
    val uiState: StateFlow<WorkspaceUiState> = _uiState.asStateFlow()

    fun setContent(content: Content?) {
        _uiState.update { it.copy(contentSelected = content) }
    }

    fun addContent(content: Content) {
        _uiState.update { it.copy(contentList = it.contentList + content)}
    }

    fun removeContent(index: Int) {
        _uiState.update { it.copy(contentList = it.contentList.filterIndexed {
            i, _ -> i != index
        })}
    }

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