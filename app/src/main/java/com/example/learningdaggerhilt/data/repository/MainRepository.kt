package com.example.learningdaggerhilt.data.repository

import com.example.learningdaggerhilt.data.api.ApiHelper
import dagger.internal.InjectedFieldSignature
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiHelper: ApiHelper) {
    suspend fun getUsers() = apiHelper.getUsers()
}