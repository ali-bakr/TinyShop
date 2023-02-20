package com.aliaboubakr.tinyshop.di

import com.aliaboubakr.domain.repo.ProductsRepo
import com.aliaboubakr.remote.ApiService
import com.aliaboubakr.repo.ProductsRepoImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
class RepoModule {

    @Provides
    fun provideProductsRepo(apiService: ApiService): ProductsRepo {
        return ProductsRepoImpl(apiService)
    }
}