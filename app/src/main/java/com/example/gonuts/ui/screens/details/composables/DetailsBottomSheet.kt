package com.example.gonuts.ui.screens.details.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.gonuts.ui.theme.Black60
import com.example.gonuts.ui.theme.Black80
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space16
import com.example.gonuts.ui.theme.space40

@Composable
fun DetailsBottomSheet(
    modifier: Modifier = Modifier
){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .fillMaxHeight(.5f)
            .clip(RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp))
            .background(Color.White)
            .padding(horizontal = space40, vertical = 35.dp)
    ) {
        Text(
            text = "Strawberry Wheel",
            style = Type.HeadLine,
            color = Salmon
        )
        Spacer(modifier = Modifier.height(33.dp))
        Text(
            text = "About Gonut",
            style = Type.SubTitle,
            color = Black80
        )
        Spacer(modifier = Modifier.height(space16))
        Text(
            text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
            style = Type.Body,
            color = Black60
        )
        Spacer(modifier = Modifier.height(26.dp))
        QuantityButtons()
        Spacer(modifier = Modifier.height(30.dp))
        DetailsFooter()
    }
}
