package net.letmethingk.pancode.presentation.ui.activity.workspace.component.drawer

import androidx.compose.ui.graphics.vector.ImageVector
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic12
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24

enum class IconButtonNavClass(
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