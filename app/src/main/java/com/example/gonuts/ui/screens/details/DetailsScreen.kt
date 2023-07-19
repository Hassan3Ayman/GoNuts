package com.example.gonuts.ui.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.example.gonuts.R
import com.example.gonuts.ui.screens.details.composables.DetailsBottomSheet
import com.example.gonuts.ui.screens.details.composables.FavoriteButton
import com.example.gonuts.ui.theme.PalePink

@Composable
fun DetailsScreen(
    viewModel: DetailsViewModel = hiltViewModel(),
    navHostController: NavHostController
){
    DetailsContent()
}

@Composable
@Preview(showBackground = true)
private fun DetailsContent(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PalePink)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(.8f)
                .fillMaxHeight(.5f)
                .align(Alignment.TopCenter),
            painter = painterResource(id = R.drawable.strawberry_wheel),
            contentDescription = "donut",
            contentScale = ContentScale.Crop
        )
        DetailsBottomSheet(modifier = Modifier.align(Alignment.BottomCenter))
        FavoriteButton(modifier = Modifier.align(Alignment.CenterEnd))
    }
}
