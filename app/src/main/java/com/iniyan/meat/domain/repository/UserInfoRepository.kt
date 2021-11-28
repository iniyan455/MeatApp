package com.iniyan.meat.domain.repository

import com.iniyan.meat.data.dto.UserInfoDto

/**  This interface is very useful for testcases actual implementation of data class also having direct access of the data we are not using this class
 * for getting something from api or database and all. Let say when we want to testcase for Usecase later that user use this repo for the usecase dont want to test we can create fake version for that repository
 * Usecase only know two method any repo can access this like fake repo or real**/
interface UserInfoRepository {
    suspend fun getUserInfo() : List<UserInfoDto>
}