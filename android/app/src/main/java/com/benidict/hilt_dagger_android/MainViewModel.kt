package com.benidict.hilt_dagger_android


import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.benidict.domain.interactor.LoadTestUseCase

class MainViewModel @ViewModelInject constructor(
    private val loadTestUseCase: LoadTestUseCase
): ViewModel(){
    fun loadTestData() = loadTestUseCase.invoke()
}