package net.letmethingk.pancode.core.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.core.ui.reusable.widgets.ButtonLarge
import net.letmethingk.pancode.core.ui.theme.PancodeTheme

@Composable
fun Uitest(modifier: Modifier) {
    var animate by remember { mutableStateOf(false) }
    PancodeTheme {
        Column(
            modifier = modifier.fillMaxSize().background(MaterialTheme.colorScheme.background),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            AnimatedVisibility(
                visible = animate,
                enter = fadeIn(animationSpec = tween(200), initialAlpha = 0F),
                exit = fadeOut(animationSpec = tween(200))
            ) {
                Box(
                    modifier = Modifier.size(200.dp).background(Color.LightGray)
                )
            }
            Spacer(modifier = Modifier.height(40.dp))
            ButtonLarge(
                onClick = { animate = !animate },
                text = "welcum"
            )
        }
    }
}