package com.example.retrofit.data

import com.example.retrofit.data.model.Products
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("products")
    suspend fun getProductsList(

    ): Products

    companion object{
        const val BASE_URL = "https://dummyjson.com/"
    }
}


//@GET("products/{type}")
//suspend fun getProductsList(          //in case we have queries and pages  so we can annotate it with this
//    @Path("type") type: String ,
//    @Query("page") page: Int,
//    @Query("api_key") api_key : String
//): Products