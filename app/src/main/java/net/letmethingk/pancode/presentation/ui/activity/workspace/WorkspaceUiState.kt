package net.letmethingk.pancode.presentation.ui.activity.workspace

import net.letmethingk.pancode.presentation.ui.activity.workspace.component.ContentTab
import net.letmethingk.pancode.presentation.ui.activity.workspace.component.main_menu.MainMenuList

data class WorkspaceUiState(

    val selectedMenu: MenuList? = null,

    val selectedMainMenu: MainMenuList? = null,

    val contentTabList: List<ContentTab> = listOf(),

    val selectedContentTab: ContentTab? = null

)