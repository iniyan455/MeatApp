package com.iniyan.data.dto

import com.iniyan.domain.model.UserInfo

data class UserInfoDto(val id : Int, val username : String)


fun UserInfoDto.toUserInfo() : UserInfo {
    return UserInfo(id = id,
    username = username)
}