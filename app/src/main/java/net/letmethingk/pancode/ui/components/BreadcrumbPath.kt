package net.letmethingk.pancode.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.unit.dp
import com.composables.defic24
import kotlinx.coroutines.flow.MutableStateFlow

@Composable
fun BreadcrumbPath(onClick: () -> Unit, isShowPath: Boolean) {
    Row(modifier = Modifier.clickable(onClick = onClick)) {
        Icon(
            imageVector = defic24,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(7.dp))
        when(isShowPath) {
            false -> { Text(
                    text = "Pancode",
                    style = MaterialTheme.typography.titleMedium
            )}
            true -> { Text(
                    text = "../mydevice/project/pancode",
                    style = MaterialTheme.typography.labelSmall
            )}
        }
    }
}