package com.iniyan.data.network

import com.iniyan.data.dto.UserInfoDto
import retrofit2.http.GET

interface Api {
    @GET("v1/userInfo")
    suspend fun getUserInfo() : List<UserInfoDto>
}