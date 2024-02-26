package com.geeksville.mesh.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.geeksville.mesh.R
import com.geeksville.mesh.ui.theme.AppTheme
import com.geeksville.mesh.util.formatAgo

@Composable
fun LastHeardInfo(
    lastHeard: Int
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(2.dp)
    ) {
        Icon(
            modifier = Modifier.height(18.dp),
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_antenna_24),
            contentDescription = null,
            tint = MaterialTheme.colors.onSurface,
        )
        Text(
            text = formatAgo(lastHeard),
            color = MaterialTheme.colors.onSurface,
            fontSize = MaterialTheme.typography.button.fontSize
        )
    }
}

@Composable
@Preview(showBackground = true)
@Preview(showBackground = true, uiMode = android.content.res.Configuration.UI_MODE_NIGHT_YES)
fun LastHeardInfoPreview() {
    AppTheme {
        LastHeardInfo((System.currentTimeMillis() / 1000).toInt() - 8600)
    }
}