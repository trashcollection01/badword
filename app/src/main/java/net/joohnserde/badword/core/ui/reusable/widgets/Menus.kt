package net.joohnserde.badword.core.ui.reusable.widgets

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.unit.dp
import net.joohnserde.badword.core.ui.theme.ShadowColor

@Composable
fun Menu(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .width(120.dp)
            .wrapContentHeight()
            .dropShadow(
                shape = RectangleShape,
                shadow = Shadow(
                    radius = 4.dp,
                    spread = 1.dp,
                    color = ShadowColor
                )
            )
            .background(
                color = MaterialTheme.colorScheme.surfaceContainer,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(vertical = 5.dp)
    ) {
        content()
    }
}

@Composable
fun Submenu(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier
            .width(200.dp)
            .wrapContentHeight()
            .dropShadow(
                shape = RectangleShape,
                shadow = Shadow(
                    radius = 4.dp,
                    spread = 1.dp,
                    color = ShadowColor
                )
            )
            .background(
                color = MaterialTheme.colorScheme.surfaceContainer,
                shape = RoundedCornerShape(5.dp)
            )
            .padding(vertical = 5.dp)
    ) {
        content()
    }
}