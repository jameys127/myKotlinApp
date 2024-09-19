package com.example.mykotlinapp.ApiFiles

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

private const val BASE_URL = "https://10.40.148.251/"

private val retrofit = Retrofit.Builder().addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ApiConnect {
    @GET("get_users.php")
    fun getUsers(): Call<String>
}

object DatabaseApi{
    val retrofitService : ApiConnect by lazy {
        retrofit.create(ApiConnect::class.java)
    }
}