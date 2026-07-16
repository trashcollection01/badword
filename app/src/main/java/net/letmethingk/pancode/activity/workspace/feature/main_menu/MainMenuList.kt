package net.letmethingk.pancode.activity.workspace.feature.main_menu

enum class MainMenuList(
    val nameMenu: String
) {
    FILE("File"),
    EDIT("Edit"),
    SELECTION("Selection"),
    VIEW("View"),
    RUN("Run"),
    TERMINAL("Terminal"),
    SETTINGS("Settings"),
    HELP("Help");
    operator fun component1(): String {
        return nameMenu
    }
}