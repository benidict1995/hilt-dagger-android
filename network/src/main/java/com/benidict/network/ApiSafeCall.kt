package com.benidict.network

import com.benidict.network.exception.ServiceException
import com.benidict.network.exception.response.ErrorResponse
import java.net.UnknownHostException

@Throws(ServiceException::class)
inline fun <T> apiSafeCall(call: () -> T) = try{
    call()
}catch (e: Exception){
    throw ServiceException(
        when(e){
            is UnknownHostException -> {
                ErrorResponse(
                    message = "No internet connection!",
                    exception = e.cause
                )
            }
            else -> {
                ErrorResponse(
                    message = e.message,
                    exception = e.cause
                )
            }
        }
    )
}