package net.joohnserde.badword.presentation.workspace

import net.joohnserde.badword.domain.workspace.model.Content
import net.joohnserde.badword.domain.workspace.model.CORE_MAIN_MENU_LIST
import net.joohnserde.badword.domain.workspace.model.MainMenu
import net.joohnserde.badword.domain.workspace.model.MenuList

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