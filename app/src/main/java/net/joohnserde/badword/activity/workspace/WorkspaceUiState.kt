package net.joohnserde.badword.activity.workspace

data class WorkspaceUiState(

    val selectedMenu: net.joohnserde.badword.activity.workspace.MenuList? = null,

    val selectedMainMenu: net.joohnserde.badword.activity.workspace.feature.main_menu.MainMenuList? = null,

    val contentTabList: List<net.joohnserde.badword.activity.workspace.feature.ContentTab> = listOf(),

    val selectedContentTab: net.joohnserde.badword.activity.workspace.feature.ContentTab? = null

)