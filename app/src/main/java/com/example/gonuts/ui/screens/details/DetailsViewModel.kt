package com.example.gonuts.ui.screens.details

import com.example.gonuts.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DetailsViewModel @Inject constructor(): BaseViewModel<DetailsUiState>(DetailsUiState()) {


}