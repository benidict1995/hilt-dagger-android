package com.benidict.network.exception

import com.benidict.network.exception.response.ErrorResponse

open class ServiceException(
    errorResponse: ErrorResponse
): RuntimeException(errorResponse.message)