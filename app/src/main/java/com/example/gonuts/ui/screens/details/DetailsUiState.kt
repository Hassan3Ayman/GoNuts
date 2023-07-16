package com.example.gonuts.ui.screens.details

import com.example.gonuts.ui.base.BaseUiState

data class DetailsUiState(
    val id: String = "",
    val name: String = "",
    val description: String = "",
    val offeredPrice: String = "",
    val actualPrice: String = "",
    val isFavorite: Boolean = false,
    val quantity: Int = 0
): BaseUiState
