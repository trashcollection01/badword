package net.joohnserde.badword.activity.workspace

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import net.joohnserde.badword.activity.workspace.feature.content_tab.model.Content

class WorkspaceViewModel : ViewModel(){

    private val _uiState = MutableStateFlow(WorkspaceUiState())
    val uiState: StateFlow<WorkspaceUiState> = _uiState.asStateFlow()

    fun setContent(index: Int) {
        _uiState.update { it.copy(selectedContent = index) }
    }

    fun addContent(content: Content) {
        _uiState.update {
            it.copy(contentList = it.contentList.plus(content))
        }
    }

    fun removeContent(index: Int) {
        if (uiState.value.contentList.lastIndex == uiState.value.selectedContent) {
            setContent(index.minus(1))
        }
        _uiState.update {
            it.copy(contentList = it.contentList.filterIndexed {
                i, _ -> i != index
            })
        }
    }

    fun switchMenu(menu: MenuList?) {
        _uiState.update { it.copy(selectedMenu = menu) }
    }
    fun switchMainMenu(mainMenuIndex: Int?) {
        _uiState.update { it.copy(selectedMainMenu = mainMenuIndex) }
    }

}