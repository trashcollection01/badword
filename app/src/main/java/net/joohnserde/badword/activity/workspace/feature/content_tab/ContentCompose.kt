package net.joohnserde.badword.activity.workspace.feature.content_tab

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ContentCompose(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .imePadding()
            .background(color = MaterialTheme.colorScheme.surfaceDim)
    ) { content() }
}