package net.letmethingk.pancode.presentation.ui.activity.workspace

import net.letmethingk.pancode.presentation.ui.activity.workspace.component.Content

data class WorkspaceUiState(

    val contentList: List<Content> = listOf(),

    val contentSelected: Content? = null

)