package com.iniyan.meat.data.repository

import com.iniyan.meat.data.network.Api
import com.iniyan.meat.data.dto.UserInfoDto
import com.iniyan.meat.domain.repository.UserInfoRepository
import javax.inject.Inject

class UserInfoRepositoyImpl @Inject constructor(private val api : Api) : UserInfoRepository {
    override suspend fun getUserInfo(): List<UserInfoDto> {
      return api.getUserInfo()
    }
}