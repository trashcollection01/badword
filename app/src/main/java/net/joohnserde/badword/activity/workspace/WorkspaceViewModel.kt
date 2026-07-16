package net.joohnserde.badword.activity.workspace

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import net.joohnserde.badword.activity.workspace.feature.ContentTab
import net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenuList

class WorkspaceViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(WorkspaceUiState())
    val uiState: StateFlow<WorkspaceUiState> = _uiState.asStateFlow()

    fun setContent(content: ContentTab?) {
        _uiState.update { it.copy(selectedContentTab = content) }
    }

    fun addContent(content: ContentTab) {
        _uiState.update { it.copy(contentTabList = it.contentTabList + content)}
    }

    fun removeContent(index: Int) {
        _uiState.update { it.copy(contentTabList = it.contentTabList.filterIndexed {
            i, _ -> i != index
        })}
    }

    fun switchMenu(menu: MenuList?) {
        _uiState.update { it.copy(selectedMenu = menu) }
    }
    fun switchMainMenu(mainMenu: MainMenuList?) {
        _uiState.update { it.copy(selectedMainMenu = mainMenu) }
    }

}