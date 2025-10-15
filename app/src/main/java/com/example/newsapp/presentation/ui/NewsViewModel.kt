package com.example.newsapp.presentation.ui

import androidx.lifecycle.ViewModel
import com.example.newsapp.domain.NewsItemList
import com.example.newsapp.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

data class NewsUiState(
    val newsList:List<NewsItemList> = emptyList()
)


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val repository: NewsRepository
):ViewModel(){

    private val _newsListStateFlow:MutableStateFlow<UiState<NewsUiState>> =
        MutableStateFlow(UiState.Uninitialized)
    val newsListStateFlow = _newsListStateFlow.asStateFlow()


    fun getNewsList()=viewModelScope.launch {


    }

}

