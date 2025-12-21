package net.letmethingk.pancode.presentation.ui.workspace.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.compose_vectors.defic24
import net.letmethingk.pancode.presentation.ui.components.reusable.IconButton24
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

/*
 * This is composable component to display drawer menu
 *
 * */
@Composable
fun DrawerMenu(isShowAnimate: Boolean) {
//    animation slide for drawer menu
    AnimatedVisibility(
        visible = isShowAnimate,
        enter = slideInHorizontally(animationSpec = tween(400), initialOffsetX = {-it / 2}),
        exit = slideOutHorizontally(animationSpec = tween(400),)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(fraction = 0.7F)
                .fillMaxHeight()
                .clickable(onClick = {}, enabled = false)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
        ) {
//            drawer menu
            Column(
                modifier = Modifier
                    .width(45.dp)
                    .fillMaxHeight()
                    .background(color = MaterialTheme.colorScheme.surface)
                    .padding(vertical = 100.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                IconButton24(
                    onClick = {},
                    imageVector = defic24,
                    contentDescription = "",
                    size = 45.dp
                )
                IconButton24(
                    onClick = {},
                    imageVector = defic24,
                    contentDescription = "",
                    size = 45.dp
                )
                IconButton24(
                    onClick = {},
                    imageVector = defic24,
                    contentDescription = "",
                    size = 45.dp
                )
            }
//            content from menu
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDrawerMenu() {
    PancodeTheme {
        Column(
            modifier = Modifier.fillMaxSize().background(Color.Magenta)
        ) {
            DrawerMenu(isShowAnimate = true)
        }
    }
}