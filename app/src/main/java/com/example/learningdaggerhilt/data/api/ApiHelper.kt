package com.example.learningdaggerhilt.data.api

import com.example.learningdaggerhilt.di.module.User
import retrofit2.Response

interface ApiHelper {
    suspend fun getUsers(): Response<List<User>>
}