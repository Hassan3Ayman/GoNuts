package com.example.gonuts.ui.screens.details.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.gonuts.R
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type


@Composable
fun DetailsFooter(){
    Row(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "$16",
            style = Type.HeadLine,
            color = Black
        )

        Button(
            modifier = Modifier
                .clip(RoundedCornerShape(32.dp)),
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(containerColor = Salmon)
        ) {
            Text(
                modifier = Modifier
                    .padding(horizontal = 32.dp, vertical = 8.dp ),
                text = "Add to Cart",
                style = Type.Title,
                color = Color.White
            )
        }
    }
}


@Composable
fun FavoriteButton(
    modifier: Modifier = Modifier
){

    Row(modifier = modifier) {
        Icon(
            modifier = Modifier
                .size(45.dp)
                .shadow(elevation = 10.dp, shape = RoundedCornerShape(16.dp))
                .clip(RoundedCornerShape(16.dp))
                .background(Color.White)
                .padding(8.dp),
            painter = painterResource(id = R.drawable.ic_like),
            contentDescription = "",
            tint = Salmon
        )

        Spacer(modifier = Modifier.width(24.dp))
    }
}