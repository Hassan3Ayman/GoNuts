package com.example.gonuts.ui.screens.home.composables

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonuts.R
import com.example.gonuts.ui.theme.Black60
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space16

@Composable
@Preview(showBackground = true)
fun DonutsList(){
    Row {
        Spacer(modifier = Modifier.width(space16))
        titleText(text = stringResource(R.string.donuts))
    }
    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 20.dp),
        horizontalArrangement = Arrangement.spacedBy((-20).dp)
    ) {
        items(count = 10) {
            DonutItem()
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DonutItem(){
    Box(
        modifier = Modifier
            .size(200.dp)
            .padding(bottom = 20.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxSize(.7f)
                .align(Alignment.BottomCenter),
            elevation = CardDefaults.cardElevation(defaultElevation = 30.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White),
            shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp, bottomStart = 10.dp, bottomEnd = 10.dp),
        ){
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Bottom
            ) {
                Text(
                    text = "Chocolate Cherry",
                    style = Type.SubTitle,
                    color = Black60
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "$22",
                    style = Type.SubTitle,
                    color = Salmon
                )

            }
        }

        Image(
            modifier = Modifier
                .fillMaxSize(.6f)
                .align(Alignment.TopCenter),
            painter = painterResource(id = R.drawable.checolate_cherry),
            contentDescription = "type",
            contentScale = ContentScale.Crop
        )
    }
}