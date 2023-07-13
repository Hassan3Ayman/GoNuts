package com.example.gonuts.ui.screens.home

import android.graphics.drawable.Drawable
import androidx.compose.ui.graphics.Color
import com.example.gonuts.ui.base.BaseUiState

data class HomeUiState(
    val todayOffers: List<TodayOffer> = emptyList(),
    val donuts : List<Donut> = emptyList()
):BaseUiState

data class TodayOffer(
    val image: Drawable,
    val color: Color,
    val name: String = "",
    val description: String = "",
    val offeredPrice: String = "",
    val actualPrice: String = "",
    val isFavorite: Boolean = false
)

data class Donut(
    val image: Drawable,
    val name: String = "",
    val price: String = ""
)