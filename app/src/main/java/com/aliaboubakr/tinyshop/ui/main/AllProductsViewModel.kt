package com.aliaboubakr.tinyshop.ui.main

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.aliaboubakr.domain.usecase.GetAllProductsUseCase
import com.aliaboubakr.domain.entity.ProductsResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class AllProductsViewModel @Inject constructor(
    private val getAllProductsUseCase: GetAllProductsUseCase
) : ViewModel() {

    private val _products:MutableStateFlow<ProductsResponse?> = MutableStateFlow(null)

    val products:StateFlow<ProductsResponse?> = _products

    fun getAllProducts() {
        viewModelScope.launch {
            try {
            _products.value=getAllProductsUseCase()
            } catch (e: Exception) {
                Log.e("AllProductsViewModel", e.message.toString())
            }

        }

    }

}