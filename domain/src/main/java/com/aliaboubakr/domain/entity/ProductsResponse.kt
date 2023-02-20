package com.aliaboubakr.domain.entity

data class ProductsResponse(
    val title: String,
    val currency: String,
    val items: List<Product>,
)