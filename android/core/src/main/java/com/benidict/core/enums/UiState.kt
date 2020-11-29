package com.benidict.core.enums

sealed class UiState<T>{
    object Loading: UiState<Nothing>()
    class Complete<T>(val data: T): UiState<T>()
    class Error<T>(val error: Throwable): UiState<T>()
}