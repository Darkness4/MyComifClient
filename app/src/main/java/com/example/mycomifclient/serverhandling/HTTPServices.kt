package com.example.mycomifclient.serverhandling

import com.google.gson.JsonArray
import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.*

interface HTTPServices {
    @GET("/api/users/info")
    fun getUser(
        @Header("Authorization") bearerToken: String
    ): Call<JsonObject>

    @GET("api/transactions/info")
    fun getTransactions(
        @Header("Authorization") bearerToken: String
    ): Call<JsonArray>

    //TODO: implement authenticate function
    @POST("api/users/login")
    @Headers("Content-Type:application/json")
    fun authenticate(@Body request: JsonObject): Call<JsonObject>
}