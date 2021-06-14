package com.dicoding.tourismapp.core.data.source.remote.response

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("list")
    fun getList(): Call<ListTourismResponse>
}