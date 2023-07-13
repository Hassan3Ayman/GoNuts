package com.example.gonuts.ui.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.gonuts.ui.theme.space16
import com.example.gonuts.ui.theme.space20
import com.example.gonuts.ui.theme.space24

@Composable
fun SpaceVertical20(){
    Spacer(modifier = Modifier.height(space20))
}
@Composable
fun SpaceVertical24(){
    Spacer(modifier = Modifier.height(space24))
}

@Composable
fun SpaceVertical60(){
    Spacer(modifier = Modifier.height(60.dp))
}

@Composable
fun SpaceVertical54(){
    Spacer(modifier = Modifier.height(54.dp))
}