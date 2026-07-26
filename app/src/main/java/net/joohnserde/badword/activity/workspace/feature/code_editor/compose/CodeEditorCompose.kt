package net.joohnserde.badword.activity.workspace.feature.code_editor.compose

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
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
import androidx.compose.ui.unit.dp
import com.skydoves.compose.stability.runtime.TraceRecomposition
import net.joohnserde.badword.R
import net.joohnserde.badword.activity.workspace.feature.content_tab.compose.ContentCompose

@TraceRecomposition
@Composable
fun CodeEditorCompose(
    textFiledState: TextFieldState,
    filePath: String
) {
    ContentCompose {
        BreadcrumbPath(filePath)

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
fun BreadcrumbPath(filePath: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(18.dp)
            .horizontalScroll(rememberScrollState())
//            .background(Color.Red)
            .padding(start = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) { Text(text = filePath, style = MaterialTheme.typography.bodySmall) }
}
