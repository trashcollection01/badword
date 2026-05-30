package net.letmethingk.pancode.presentation.ui.common.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

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
        exit = fadeOut(targetAlpha = 0F, animationSpec = tween(200))
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
        ) { content() }
    }
}

@Composable
fun CleanOverlay(
    onClick: () -> Unit,
    isShow: Boolean,
    content: @Composable () -> Unit
) {
    if (isShow) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .clickable(
                    onClick = onClick,
                    indication = null,
                    interactionSource = remember { MutableInteractionSource() },
                )
        ) { content() }
    }
}
