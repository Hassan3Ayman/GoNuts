package com.example.gonuts.ui.screens.details

import androidx.lifecycle.viewModelScope
import com.example.gonuts.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(): BaseViewModel<DetailsUiState>(DetailsUiState()) {

    init {
        viewModelScope.launch {
            delay(500)
            _state.update { it.copy(isLoading = false) }
        }
    }
}