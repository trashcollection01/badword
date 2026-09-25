package net.joohnserde.badword.domain.drawer.model

import androidx.compose.ui.graphics.vector.ImageVector
import net.joohnserde.badword.presentation.common.reusable.vectors.defic24

enum class ContentPane(
    val icon: ImageVector,
    val description: String,
    val onClick: () -> Unit
) {
    PROJECT(
        icon = defic24,
        description = "Project",
        onClick = {}
    ),
    SEARCH(
        icon = defic24,
        description = "Search",
        onClick = {}
    ),
    VCS(
        icon = defic24,
        description = "Version Control System",
        onClick = {}
    ),
    EXTENSION(
        icon = defic24,
        description = "Extensions",
        onClick = {}
    );

    operator fun component1(): ImageVector {
        return icon
    }
    operator fun component2(): String {
        return description
    }


}