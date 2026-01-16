package net.letmethingk.pancode.presentation.ui.activity.code_editor.component

import android.provider.ContactsContract
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import net.letmethingk.pancode.presentation.ui.theme.Typography

@Composable
fun DirectoryName(
    directoryName: String,
) {
    Text(
        text = directoryName,
        modifier = Modifier.clickable(onClick = {
        })
    )
}

@Preview(showBackground = true)
@Composable
fun BreadcrumbPath() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(40.dp)
//            .background(Color.Red)
            .padding(start = 10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            "Project / MyProject / pancode / README.md"
        )
    }
}