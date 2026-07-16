package net.joohnserde.badword.activity.workspace.feature.drawer_menu

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
import net.joohnserde.badword.core.ui.reusable.widgets.IconButton24
import net.joohnserde.badword.core.ui.reusable.widgets.Overlay
import net.joohnserde.badword.core.ui.theme.PancodeTheme

/*
 * This is composable component to display drawer menu
 *
 * */
@Composable
fun DrawerMenu(isShow: Boolean, onClick: () -> Unit ) {

    Overlay(
        onClick = onClick,
        isShowAnimate = isShow,
        alignment = Alignment.TopStart
    ) { }

//    animation slide for drawer menu
    AnimatedVisibility(
        visible = isShow,
        enter = slideInHorizontally(animationSpec = tween(500), initialOffsetX = { -it }),
        exit = slideOutHorizontally(animationSpec = tween(400), targetOffsetX = { -it })
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth(fraction = 0.7F)
                .fillMaxHeight()
                .clickable(onClick = {}, enabled = false)
                .background(color = MaterialTheme.colorScheme.surfaceVariant)
        ) {
//            Navigation drawer
            NavButtonDrawer()
//            Tool content
        }
    }
}

@Composable
fun NavButtonDrawer() {
    Column(
        modifier = Modifier
            .width(45.dp)
            .fillMaxHeight()
            .padding(vertical = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        ContentPane.entries.forEach { (icon, description) ->
            IconButton24(
                onClick = {},
                imageVector = icon,
                contentDescription = description,
                size = 45.dp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDrawerMenu() {
    PancodeTheme {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Magenta)
        ) {
            DrawerMenu(
                isShow = true,
                onClick = {}
            )
        }
    }
}