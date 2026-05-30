package net.letmethingk.pancode.presentation.ui.activity.workspace.component.code_editor

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.TextFieldState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.R
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun CodeEditorScreen(textFiledState: TextFieldState, filePathList: List<String>) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
            .background(color = MaterialTheme.colorScheme.surfaceDim)
    ) {
        BreadcrumbPath(filePathList)
        BasicTextField(
                state = textFiledState,
                lineLimits = TextFieldLineLimits.MultiLine(),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(vertical = 5.dp, horizontal = 5.dp)
                    .horizontalScroll(state = rememberScrollState(), overscrollEffect = null),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = FontFamily(Font(R.font.jetbrainsmono)),
                color = if (isSystemInDarkTheme()) Color.White else Color.Black
            )
        )
    }
}

@Composable
fun BreadcrumbPath(filePathList: List<String>) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(25.dp)
            .horizontalScroll(rememberScrollState())
//            .background(Color.Red)
            .padding(start = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(modifier = Modifier.clickable(
            onClick = {}
        )) {
            filePathList.forEach { value ->
                if (value != filePathList.first()) {
                    Text(
                        text = " / ",
                        style = MaterialTheme.typography.bodySmall
                    )
                }
                Text(
                    text = value ,
                    style = MaterialTheme.typography.bodySmall
                )
            }
        }
    }
}
