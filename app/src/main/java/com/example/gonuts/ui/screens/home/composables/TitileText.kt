package com.example.gonuts.ui.screens.home.composables

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.Type

@Composable
fun titleText(text: String) {
    Text(
        text = text,
        style = Type.Title,
        color = Black
    )
}