package com.iniyan.data.repository

import com.iniyan.data.network.Api
import com.iniyan.data.dto.UserInfoDto
import com.iniyan.domain.repository.UserInfoRepository
import javax.inject.Inject

class UserInfoRepositoyImpl @Inject constructor(private val api : Api) : UserInfoRepository {
    override suspend fun getUserInfo(): List<UserInfoDto> {
      return api.getUserInfo()
    }
}