package com.example.gonuts.ui.screens.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.gonuts.R
import com.example.gonuts.ui.theme.Black
import com.example.gonuts.ui.theme.Black60
import com.example.gonuts.ui.theme.Black80
import com.example.gonuts.ui.theme.PalePink
import com.example.gonuts.ui.theme.Salmon
import com.example.gonuts.ui.theme.Type
import com.example.gonuts.ui.theme.space16
import com.example.gonuts.ui.theme.space32
import com.example.gonuts.ui.theme.space40

@Composable
fun DetailsScreen(
    viewModel: DetailsViewModel = hiltViewModel()
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
        Spacer(modifier = Modifier.height(50.dp))
        DetailsFooter()
    }
}

@Composable
fun QuantityButtons(){

    Row(
        modifier = Modifier.fillMaxWidth(.5f),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            modifier = Modifier
                .size(45.dp)
                .shadow(elevation = 10.dp, shape = RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White),
            text = "-",
            style = Type.SubTitle,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .size(45.dp)
                .shadow(elevation = 10.dp, shape = RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White),
            text = "1",
            style = Type.SubTitle,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )

        Text(
            modifier = Modifier
                .size(45.dp)
                .shadow(elevation = 10.dp, shape = RoundedCornerShape(12.dp))
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White),
            text = "+",
            style = Type.SubTitle,
            fontSize = 30.sp,
            textAlign = TextAlign.Center
        )
    }
}

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
                .clip(RoundedCornerShape(32.dp))
                .background(Salmon)
                ,
            onClick = { /*TODO*/ }
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