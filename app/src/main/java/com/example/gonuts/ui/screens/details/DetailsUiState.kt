package com.example.gonuts.ui.screens.details

import com.example.gonuts.ui.base.BaseUiState

data class DetailsUiState(
    val name: String = "",
    val description: String = "",
    val Price: String = "",
    val isFavorite: Boolean = false,
    val quantity: Int = 0,
    val isLoading: Boolean = true
): BaseUiState
