package com.iniyan.meat.domain.model

data class UserInfoState(
    val isLoading: Boolean = false,
    val userInfo: List<UserInfo> = emptyList(),
    val error: String = ""
)