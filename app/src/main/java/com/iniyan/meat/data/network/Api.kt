package com.iniyan.meat.data.network

import com.iniyan.meat.data.dto.UserInfoDto
import retrofit2.http.GET

interface Api {
    @GET("v1/userInfo")
    suspend fun getUserInfo() : List<UserInfoDto>
}