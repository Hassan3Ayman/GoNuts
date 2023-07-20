package com.example.gonuts.ui.screens.welcome

import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.gonuts.R
import com.example.gonuts.ui.composables.SpaceVertical20
import com.example.gonuts.ui.composables.SpaceVertical60
import com.example.gonuts.ui.screens.home.navigateToHome
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.LightSalmon
import com.example.gonuts.ui.theme.PalePink
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space12
import com.example.gonuts.ui.theme.space40

@Composable
fun WelcomeScreen(navHostController: NavHostController) {
    welcomeContent { navHostController.navigateToHome() }
}

@Composable
private fun welcomeContent(onClickToHome: () -> Unit) {
    Box(
        modifier = Modifier.fillMaxSize()
    ){
        textColumns(onClickToHome)
        backgroundImage()
    }
}

@Composable
fun textColumns(onClickToHome: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PalePink)
            .padding(start = space40, end = space40, bottom = space40),
        verticalArrangement = Arrangement.Bottom
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(id = R.string.welcome_text),
            style = Type.LargeText,
            color = Salmon
        )
        SpaceVertical20()
        Text(
            modifier = Modifier
                .fillMaxWidth(),
            text = stringResource(id = R.string.welcome_text_body),
            style = Type.SubTitle,
            color = LightSalmon
        )

        SpaceVertical60()
        button(onClick = onClickToHome, text = stringResource(id = R.string.get_started))
    }
}

@Composable
fun backgroundImage(){
    val transition = rememberInfiniteTransition()
    val offsetY by transition.animateFloat(
        initialValue = -10f,
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = tween(5000),
            repeatMode = RepeatMode.Reverse
        )
    )

    val offsetX by transition.animateFloat(
        initialValue = -10f,
        targetValue = 10f,
        animationSpec = infiniteRepeatable(
            animation = tween(5000),
            repeatMode = RepeatMode.Reverse
        )
    )
    Image(
        modifier = Modifier.
        fillMaxWidth()
            .offset(x = offsetX.dp, y = offsetY.dp),
        painter = painterResource(id = R.drawable.welcome_image),
        contentDescription = "",
        contentScale = ContentScale.Crop
    )
}


@Composable
fun button(
    text: String,
    onClick: () -> Unit
){
    Button(
        modifier = Modifier
            .fillMaxWidth(),
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(containerColor = Color.White)
    ) {
        Text(
            modifier = Modifier
                .padding(vertical = space12),
            text = text,
            style = Type.Title,
            color = Black
        )
    }
}
