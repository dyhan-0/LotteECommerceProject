package com.dy.lotteecommerceproject.di

import com.dy.lotteecommerceproject.repository.DataRepository
import com.dy.lotteecommerceproject.repository.DataRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn

import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class, ViewModelComponent::class)
abstract class BindModule {

    /**
     * @Binds 주석은 인터페이스의 인스턴스를 제공해야 할 때 사용할 구현을 Hilt에 알려줍니다.
     * 1. 함수 반환 유형은 함수가 어떤 인터페이스의 인스턴스를 제공하는지 Hilt에 알려줍니다.
     * 2. 함수 매개변수는 제공할 구현을 Hilt에 알려줍니다.
     */
    @Binds
    abstract fun bindRepository(
        repositoryImpl: DataRepositoryImpl,
    ): DataRepository

}