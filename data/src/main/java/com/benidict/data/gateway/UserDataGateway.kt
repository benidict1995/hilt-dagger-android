package com.benidict.data.gateway

import com.benidict.data.service.RemoteService
import com.benidict.domain.gateway.UserGateway
import com.benidict.domain.model.User
import com.benidict.network.apiSafeCall
import javax.inject.Inject

class UserDataGateway @Inject constructor(
    private val remoteService: RemoteService
): UserGateway{
    override suspend fun loadUserList(): List<User> = apiSafeCall {
        remoteService.loadUserList()
    }
}