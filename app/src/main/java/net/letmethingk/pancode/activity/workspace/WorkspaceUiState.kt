package net.letmethingk.pancode.activity.workspace

data class WorkspaceUiState(

    val selectedMenu: net.letmethingk.pancode.activity.workspace.MenuList? = null,

    val selectedMainMenu: net.letmethingk.pancode.activity.workspace.feature.main_menu.MainMenuList? = null,

    val contentTabList: List<net.letmethingk.pancode.activity.workspace.feature.ContentTab> = listOf(),

    val selectedContentTab: net.letmethingk.pancode.activity.workspace.feature.ContentTab? = null

)