package com.benidict.domain.interactor

import com.benidict.domain.gateway.UserGateway
import javax.inject.Inject

class LoadUserListUseCase @Inject constructor(
    private val userGateway: UserGateway
){
    suspend fun invoke() = userGateway.loadUserList()
}