package com.benidict.data.service

import com.benidict.domain.model.User
import retrofit2.http.GET

/**
 * This class is for remote data source integration.
**/
interface RemoteService {
    @GET("users")
    suspend fun loadUserList(): List<User>
}