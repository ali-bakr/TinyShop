package com.aliaboubakr.tinyshop.di

import com.aliaboubakr.domain.repo.ProductsRepo
import com.aliaboubakr.domain.usecase.GetAllProductsUseCase
import com.aliaboubakr.remote.ApiService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideUseCase(productRepo:ProductsRepo):GetAllProductsUseCase{
        return GetAllProductsUseCase(productRepo)
    }
}