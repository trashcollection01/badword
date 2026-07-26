package net.joohnserde.badword.activity.workspace

import net.joohnserde.badword.activity.workspace.feature.content_tab.model.Content
import net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenuList

data class WorkspaceUiState(

    val selectedMenu: MenuList? = null,

    val selectedMainMenu: MainMenuList? = null,

    val contentList: List<Content> = listOf(),

    val selectedContent: Int = 0

)