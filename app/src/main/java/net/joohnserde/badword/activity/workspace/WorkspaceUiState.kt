package net.joohnserde.badword.activity.workspace

import net.joohnserde.badword.activity.workspace.feature.content_tab.model.Content
import net.joohnserde.badword.activity.workspace.feature.main_menu.core.CORE_MAIN_MENU_LIST
import net.joohnserde.badword.activity.workspace.feature.main_menu.model.MainMenu

data class WorkspaceUiState(

    val menuList: List<MainMenu>,

    val selectedMenu: MenuList?,

    val mainMenuList: List<MainMenu>,

    val selectedMainMenu: Int?,

    val contentList: List<Content>,

    val selectedContent: Int,

    ) {

    constructor() : this(

        menuList = listOf(),

        selectedMenu = null,

        mainMenuList = CORE_MAIN_MENU_LIST,

        selectedMainMenu = null,

        contentList = listOf(),

        selectedContent = 0,

    )
}