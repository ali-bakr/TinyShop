package com.aliaboubakr.domain.repo

import com.aliaboubakr.domain.entity.ProductsResponse

interface ProductsRepo {
   suspend fun getProductsFromRemote(): ProductsResponse
}