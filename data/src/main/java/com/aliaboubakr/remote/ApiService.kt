package com.aliaboubakr.remote

import com.aliaboubakr.domain.entity.ProductsResponse
import retrofit2.http.GET

interface ApiService {

    @GET("v3/5c138271-d8dd-4112-8fb4-3adb1b7f689e")
    suspend fun getAllProducts(): ProductsResponse
}