package net.letmethingk.pancode.presentation.ui.activity.code_editor.component

import android.provider.ContactsContract
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import net.letmethingk.pancode.presentation.ui.activity.code_editor.CodeEditorViewModel
import net.letmethingk.pancode.presentation.ui.theme.Typography

@Composable
fun BreadcrumbPath(viewModel: CodeEditorViewModel = viewModel()) {
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
            viewModel.listFilePath.forEach { value ->
                if (value != viewModel.listFilePath.first()) {
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