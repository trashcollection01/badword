package net.joohnserde.badword.activity.workspace

import net.joohnserde.badword.activity.workspace.feature.content_tab.ContentTab
import net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenuList

data class WorkspaceUiState(

    val selectedMenu: MenuList? = null,

    val selectedMainMenu: MainMenuList? = null,

    val contentTabList: List<ContentTab> = listOf(),

    val selectedContentTab: ContentTab? = null

)