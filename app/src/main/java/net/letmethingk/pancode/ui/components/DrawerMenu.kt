package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.composables.defic24
import net.letmethingk.pancode.ui.components.reusable.IconButton24
import net.letmethingk.pancode.ui.theme.PancodeTheme

@Composable
fun DrawerMenu() {
    Row(
        modifier = Modifier
            .fillMaxWidth(fraction = 0.7F)
            .fillMaxHeight()
            .clickable(onClick = {}, enabled = false)
            .background(color = MaterialTheme.colorScheme.surfaceVariant)
    ) {
        Column(
            modifier = Modifier
                .width(45.dp)
                .fillMaxHeight()
                .background(color = MaterialTheme.colorScheme.surface)
                .padding(vertical = 100.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            IconButton24(onClick = {}, imageVector = defic24, contentDescription = "", size = 45.dp)
            IconButton24(onClick = {}, imageVector = defic24, contentDescription = "", size = 45.dp)
            IconButton24(onClick = {}, imageVector = defic24, contentDescription = "", size = 45.dp)
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
            DrawerMenu()
        }
    }
}