package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.shape.*
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.dropShadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.shadow.Shadow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.composables.defic24
import net.letmethingk.pancode.ui.components.reusable.DropdownMenuButton
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.components.reusable.Submenu
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun CustomMainMenu(
    modifier: Modifier = Modifier
) {
    var expandedFileMenu by remember { mutableStateOf(false) }
    var expandedEditMenu by remember { mutableStateOf(false) }
    Row (
        modifier = modifier
            .width(325.dp)
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.End
    ) {
        if (expandedEditMenu) {
            Submenu(
                content = {},
                modifier = Modifier.offset(x = 0.dp, y = 35.dp)
            )
        }
        if (expandedFileMenu) {
            Submenu(
                content = {},
                modifier = Modifier.offset(x = 0.dp, y = 0.dp)
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Column(
            modifier = Modifier
                .width(120.dp)
                .wrapContentHeight()
                .dropShadow(
                    shape = RectangleShape,
                    shadow = Shadow(
                        radius = 4.dp,
                        spread = 1.dp,
                        color = Color(0x40000000)
                    )
                )
                .background(
                    color = MaterialTheme.colorScheme.surfaceContainerLow,
                    shape = RoundedCornerShape(5.dp)
                )
                .padding(vertical = 5.dp)
        ) {
            DropdownMenuButton(
                onClick = {
                    expandedFileMenu = true
                    expandedEditMenu = false
                },
                text = "File"
            )
            DropdownMenuButton(
                onClick = {
                    expandedEditMenu = true
                    expandedFileMenu = false
                },
                text = "Edit"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Selection"
            )
            DropdownMenuButton(
                onClick = {},
                text = "View"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Run"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Terminal"
            )
            HorizontalDivider(
                modifier = Modifier.padding(vertical = 5.dp, horizontal = 10.dp),
                color = MaterialTheme.colorScheme.surfaceDim
            )
            DropdownMenuButton(
                onClick = {},
                text = "Settings"
            )
            DropdownMenuButton(
                onClick = {},
                text = "Help"
            )
        }
    }
}

@Preview()
@Composable
fun MainMenuPreview() {
    PancodeTheme {
        CustomMainMenu()
    }
}
