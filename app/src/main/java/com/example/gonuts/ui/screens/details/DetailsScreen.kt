package com.example.gonuts.ui.screens.details

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
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
) {
    val state by viewModel.state.collectAsState()
    DetailsContent(state)
}

@Composable
private fun DetailsContent(state: DetailsUiState) {

    val scale by animateFloatAsState(
        targetValue = if (!state.isLoading) 1f else 0f,
        animationSpec = tween(1000)
    )

    val rotation by animateFloatAsState(
        targetValue = if (!state.isLoading) 0f else 360f,
        animationSpec = tween(1000)
    )

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(PalePink)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth(.8f)
                .fillMaxHeight(.5f)
                .align(Alignment.TopCenter)
                .graphicsLayer {
                    scaleX = scale
                    scaleY = scale
                    rotationZ = rotation
                },
            painter = painterResource(id = R.drawable.strawberry_wheel),
            contentDescription = "donut",
            contentScale = ContentScale.Crop
        )
        DetailsBottomSheet(modifier = Modifier.align(Alignment.BottomCenter))
        FavoriteButton(modifier = Modifier.align(Alignment.CenterEnd))
    }
}
