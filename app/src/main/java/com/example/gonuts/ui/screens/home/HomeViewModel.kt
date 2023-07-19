package com.example.gonuts.ui.screens.home

import com.example.gonuts.ui.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): BaseViewModel<HomeUiState>(HomeUiState()) {


}