package com.aliaboubakr.domain.usecase

import com.aliaboubakr.domain.repo.ProductsRepo

class GetAllProductsUseCase(private val productsRepo: ProductsRepo) {

    suspend operator fun invoke() = productsRepo.getProductsFromRemote()

}