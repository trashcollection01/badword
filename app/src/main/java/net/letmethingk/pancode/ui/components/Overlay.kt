package net.letmethingk.pancode.ui.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun Overlay(
    onClick: () -> Unit,
    isShowAnimate: Boolean,
    alignment: Alignment,
    content: @Composable () -> Unit
) {
    AnimatedVisibility(
        visible = isShowAnimate,
        enter = fadeIn(initialAlpha = 0F, animationSpec = tween(200)),
        exit = fadeOut(targetAlpha = 0F, animationSpec = tween(400))
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = onClick,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                )
                .background(color = Color(0x70000000)),
            contentAlignment = alignment
        ) {
            content()
        }
    }
}

@Composable
fun TransparentHeaderOverlay(
    onClick: () -> Unit,
    content: @Composable () -> Unit
) {
    Box(
        modifier = Modifier
            .padding(top = 60.dp)
            .fillMaxSize()
            .clickable(
                onClick = onClick,
                indication = null,
                interactionSource = remember { MutableInteractionSource() },
            )
    ) {
        content()
    }
}

@Preview
@Composable
fun PreviewOverlay() {
    var ishh by remember { mutableStateOf(false) }
    PancodeTheme {
        Overlay(onClick = {ishh = !ishh}, isShowAnimate = ishh, alignment = Alignment.Center ) { }
    }
}