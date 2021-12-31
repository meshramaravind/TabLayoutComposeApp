package com.arvind.tablayoutcomposeapp.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.arvind.tablayoutcomposeapp.ui.theme.colorPrimary

@Composable
fun TabMusicScreen(tabName: String) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = tabName,
            style = MaterialTheme.typography.h5,
            color = colorPrimary,
            fontWeight = FontWeight.Bold
        )

    }
}

@Preview(showBackground = true)
@Composable
fun TabMusicScreenPreview() {
    TabMusicScreen(tabName = "Music")
}