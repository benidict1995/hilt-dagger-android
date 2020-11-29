package com.benidict.userlist

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.switchMap
import com.benidict.core.enums.UiState
import com.benidict.domain.interactor.LoadUserListUseCase
import com.benidict.network.exception.ServiceException

class UserListViewModel @ViewModelInject constructor(
    private val loadUserListUseCase: LoadUserListUseCase
) : ViewModel(){


    val doLoadUserList = MutableLiveData<Boolean>()
    val loadUserList = doLoadUserList.switchMap {
        liveData {
            emit(UiState.Loading)
            try{
                val call = loadUserListUseCase.invoke()
                emit(UiState.Complete(call))
            }catch (e: ServiceException){
                emit(UiState.Error(e))
            }
        }
    }

}