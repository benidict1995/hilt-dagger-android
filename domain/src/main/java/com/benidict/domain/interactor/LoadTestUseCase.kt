package com.benidict.domain.interactor

import com.benidict.domain.gateway.TestGateway
import javax.inject.Inject

class LoadTestUseCase @Inject constructor(
    private val testGateway: TestGateway
){
    fun invoke() = testGateway.loadStringData()
}