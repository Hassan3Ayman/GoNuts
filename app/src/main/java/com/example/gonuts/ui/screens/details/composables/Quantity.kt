package com.example.gonuts.ui.screens.details.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.Type


@Composable
fun QuantityButtons(){

    Row(
        modifier = Modifier.fillMaxWidth(.5f),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        QuantityText(text = "-", background =  Color.White, color = Black)
        QuantityText(text = "1", background =  Color.White, color = Black)
        QuantityText(text = "+", background = Black, color = Color.White)
    }
}

@Composable
fun QuantityText(text: String, background: Color, color: Color){
    Text(
        modifier = Modifier
            .size(45.dp)
            .shadow(elevation = 10.dp, shape = RoundedCornerShape(12.dp))
            .clip(RoundedCornerShape(12.dp))
            .background(background),
        text = text,
        style = Type.SubTitle,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        color = color
    )
}