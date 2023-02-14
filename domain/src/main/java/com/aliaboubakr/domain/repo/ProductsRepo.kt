package com.aliaboubakr.domain.repo

import com.assignment.products.data.entity.ProductResponse

interface ProductsRepo {
    fun getProductsFromRemote():ProductResponse
}