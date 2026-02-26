package net.letmethingk.pancode.presentation.ui.activity.code_editor

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable2D
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.ime
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.input.TextFieldLineLimits
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.R
import net.letmethingk.pancode.presentation.ui.activity.code_editor.component.BreadcrumbPath
import net.letmethingk.pancode.presentation.ui.activity.code_editor.component.code
import net.letmethingk.pancode.presentation.ui.theme.PancodeTheme

@Composable
fun CodeEditorScreen() {
    val inpCodeText = rememberTextFieldState(initialText = code)
    val scrollPosition = rememberScrollState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
            .background(color = MaterialTheme.colorScheme.surfaceDim)
    ) {
        BreadcrumbPath()
        BasicTextField(
            state = inpCodeText,
            lineLimits = TextFieldLineLimits.MultiLine(),
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 5.dp, horizontal = 5.dp)
                .horizontalScroll(state = scrollPosition, overscrollEffect = null),
            textStyle = MaterialTheme.typography.bodyLarge.copy(
                fontFamily = FontFamily(Font(R.font.jetbrainsmono)),
                color = if (isSystemInDarkTheme()) Color.White else Color.Black
            )
        )
    }
}

@Preview
@Composable
fun CodeEditorScreenPreview() {
    PancodeTheme {
        CodeEditorScreen()
    }
}
