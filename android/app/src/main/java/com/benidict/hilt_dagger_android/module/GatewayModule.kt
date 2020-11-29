package com.benidict.hilt_dagger_android.module

import com.benidict.data.gateway.TestDataGateway
import com.benidict.data.gateway.UserDataGateway
import com.benidict.data.service.RemoteService
import com.benidict.domain.gateway.TestGateway
import com.benidict.domain.gateway.UserGateway
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class GatewayModule{

    @Provides
    @Singleton
    fun provideTestDataGateway(): TestGateway = TestDataGateway()

    @Provides
    @Singleton
    fun provideUserListDataGateway(remoteService: RemoteService): UserGateway = UserDataGateway(remoteService)

}