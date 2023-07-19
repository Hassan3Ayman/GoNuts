package com.example.gonuts.ui.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.gonuts.R
import com.example.gonuts.ui.screens.details.navigateToDetailsScreen
import com.example.gonuts.ui.screens.home.composables.DonutsList
import com.example.gonuts.ui.screens.home.composables.todayOffersList
import com.example.gonuts.ui.theme.Black60
import com.example.gonuts.ui.theme.PalePink
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space16

@Composable
fun HomeScreen(navHostController: NavHostController) {
    HomeContent(
        onClickOffered = { id -> navHostController.navigateToDetailsScreen(id)}
    )
}

@Composable
private fun HomeContent(onClickOffered: (Int) -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        header()
        todayOffersList(onClickOffered)
        Spacer(modifier = Modifier.height(40.dp))
        DonutsList()
    }
}

@Composable
@Preview(showBackground = true)
fun header() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(space16),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        headLineHeader()
        RoundedIcon()
    }
}

@Composable
fun headLineHeader() {
    Column {
        Text(
            text = stringResource(R.string.home_title),
            style = Type.HeadLine,
            color = Salmon
        )
        Text(
            text = stringResource(R.string.home_subtitle),
            style = Type.SubTitle,
            color = Black60
        )
    }
}

@Composable
@Preview
fun RoundedIcon() {
    Icon(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(PalePink)
            .size(45.dp)
            .padding(top = 6.dp, start = 7.dp, end = 3.dp, bottom = 4.dp),
        painter = painterResource(id = R.drawable.ic_search),
        contentDescription = "search",
        tint = Salmon
    )
}