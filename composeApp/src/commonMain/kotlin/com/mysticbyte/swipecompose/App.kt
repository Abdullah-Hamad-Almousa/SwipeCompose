package com.mysticbyte.swipecompose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {

    Box(
        modifier = Modifier
            .fillMaxSize()
            // It might have a background modifier like this:
            .background(MaterialTheme.colorScheme.background) // This defaults to white in the light theme
    ){
        logicCode()
    }

}