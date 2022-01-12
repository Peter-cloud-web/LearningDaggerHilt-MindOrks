package com.example.learningdaggerhilt.data.api

import com.example.learningdaggerhilt.data.model.User
import retrofit2.Response
import javax.inject.Inject

class ApiHelperImpl @Inject constructor(private val apiService: ApiService): ApiHelper{
    override suspend fun getUsers():Response<List<User>> = apiService.getUsers()
}