package com.benidict.data.gateway

import com.benidict.domain.gateway.TestGateway

class TestDataGateway : TestGateway{
    override fun loadStringData(): String = "Load test data string!"
}