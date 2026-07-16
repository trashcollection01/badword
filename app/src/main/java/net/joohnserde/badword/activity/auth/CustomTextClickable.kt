package net.joohnserde.badword.activity.auth

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.LinkInteractionListener
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink

@Composable
fun CustomTextClickable(

    textBeforeLink: String,

    textLink: String,

    linkInteractionListener: () -> LinkInteractionListener?

) {
    Text(
        text = buildAnnotatedString {

            append(textBeforeLink)

            val link = LinkAnnotation.Clickable(
                tag = "onClick",
                styles = TextLinkStyles(
                    style = SpanStyle(
                        color = MaterialTheme.colorScheme.secondary,
                        textDecoration = TextDecoration.None
                    )
                ),
                // Do something
                linkInteractionListener = linkInteractionListener()
            )

            withLink(link = link) {
                append(text = textLink)
            }
        },
        style = MaterialTheme.typography.bodyMedium,
    )
}