package com.example.retrofit.data


import com.example.retrofit.data.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {

    suspend fun getProductsList(): Flow<Result<List<Product>>>
}
