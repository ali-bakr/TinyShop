package com.aliaboubakr.repo

import com.aliaboubakr.domain.repo.ProductsRepo
import com.aliaboubakr.remote.ApiService
import com.aliaboubakr.domain.entity.ProductsResponse

class ProductsRepoImpl(private val apiService: ApiService) :ProductsRepo{
    //    fun getProductsFromRemote():ProductResponse
    override  suspend fun getProductsFromRemote(): ProductsResponse =apiService.getAllProducts()
}