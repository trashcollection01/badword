package net.joohnserde.badword.activity.workspace.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import net.joohnserde.badword.activity.workspace.MenuList
import net.joohnserde.badword.activity.workspace.WorkspaceViewModel
import net.joohnserde.badword.activity.workspace.feature.code_editor.code
import net.joohnserde.badword.activity.workspace.feature.code_editor.model.CodeEditor
import net.joohnserde.badword.core.ui.reusable.vectors.defic24
import net.joohnserde.badword.core.ui.reusable.widgets.IconButton24


@Composable
fun TopbarMenu() {

    val viewModel: WorkspaceViewModel = viewModel()

//    val selectedMenu by viewModel.selectedMenu.collectAsStateWithLifecycle()
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(color = MaterialTheme.colorScheme.surface)
            .padding(horizontal = 15.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {

        Row {
//                Drawer menu icon button
            IconButton24(
                onClick = {
                    viewModel.switchMenu(MenuList.DrawerMenu) },
                imageVector = defic24,
                contentDescription = "drawer-menu"
            )

            Spacer(modifier = Modifier.width(25.dp))

//                File Path menu title button
            Row(modifier = Modifier.clickable(
                onClick = { viewModel.switchMenu(MenuList.PathMenu) })) {
                Icon(
                    imageVector = defic24,
                    contentDescription = null
                )
                Spacer(modifier = Modifier.width(7.dp))
                Text(
                    text = "Badword",
                    style = MaterialTheme.typography.titleMedium
                )
            }
        }
//            Main menu icon button
        IconButton24(
            onClick = {
                viewModel.switchMenu(MenuList.MainMenu);
                viewModel.addContent(CodeEditor("coba", textFieldState = TextFieldState(code)))
            },
            imageVector = defic24,
            contentDescription = "main-menu"
        )
    }
}