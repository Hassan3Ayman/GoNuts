package com.example.gonuts.ui.screens.home.composables

import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.gonuts.R
import com.example.gonuts.ui.composables.SpaceVertical24
import com.example.gonuts.ui.theme.BabyPink
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.Black60
import com.example.gonuts.ui.theme.LightSalmon
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space16

@Composable
fun todayOffersList(onClickOffered: (Int) -> Unit) {
    Row {
        Spacer(modifier = Modifier.width(space16))
        titleText(text = stringResource(id = R.string.today_offers))
    }
    SpaceVertical24()
    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(horizontal = 40.dp),
        horizontalArrangement = Arrangement.spacedBy(40.dp)
    ) {
        items(count = 10) {
            todayOfferItem(onClickOffered, id = it)
        }
    }
}


@Composable
fun todayOfferItem(onClickOffered: (Int) -> Unit, id: Int) {

    Box(
        modifier = Modifier
            .width(200.dp)
            .height(310.dp)
            .clickable { onClickOffered(id) }
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(.9f)
                .fillMaxHeight(),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            colors = CardDefaults.cardColors(contentColor = BabyPink)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(bottom = 15.dp, end = 15.dp, start = 15.dp, top = 14.dp),
            ) {
                favouriteButton()
                Spacer(modifier = Modifier.fillMaxSize(.6f))
                Text(
                    text = "Strawberry Wheel",
                    style = Type.SubTitle,
                    color = Black
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "These Baked Strawberry Donuts are filled with fresh strawberries this is not be added",
                    style = Type.Body,
                    maxLines = 3,
                    overflow = TextOverflow.Ellipsis,
                    color = Black60
                )
                prices()

            }
        }

        Image(
            modifier = Modifier
                .fillMaxSize(.8f)
                .align(Alignment.TopEnd)
                .offset(x = (29).dp),
            painter = painterResource(id = R.drawable.strawberry_wheel),
            contentDescription = "cake",
            contentScale = ContentScale.Crop,
        )
    }
}

@Composable
@Preview
fun favouriteButton(
    modifier: Modifier = Modifier
) {
    var isClicked by remember {
        mutableStateOf(false)
    }

    val background by animateColorAsState(targetValue = if (isClicked) LightSalmon else Color.White)
    Icon(
        modifier = modifier
            .clip(CircleShape)
            .background(background)
            .padding(top = 9.dp, start = 8.dp, end = 7.dp, bottom = 7.dp),
        painter = painterResource(id = R.drawable.ic_love),
        contentDescription = "love it",
        tint = Salmon
    )
}

@Composable
fun prices(){
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.End,
        verticalAlignment = Alignment.Bottom
    ) {
        Text(
            text = "$20",
            style = Type.SubTitle,
            color = Black60,
            textDecoration = TextDecoration.LineThrough
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = "$16",
            style = Type.Title,
            color = Black
        )
    }
}