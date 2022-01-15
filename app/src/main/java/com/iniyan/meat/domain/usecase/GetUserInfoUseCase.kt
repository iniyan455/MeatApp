package com.iniyan.meat.domain.usecase

import com.iniyan.common.utitiles.util.Resource
import com.iniyan.meat.data.dto.toUserInfo
import com.iniyan.meat.domain.model.UserInfo
import com.iniyan.meat.domain.repository.UserInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val userInfoRepository : UserInfoRepository
) {
    /** We want to emit multiple values over a period of time for loading usecases we need to emit status - success,failure */
    operator fun invoke() : Flow<Resource<List<UserInfo>>> = flow {
        try {
            emit(Resource.Loading(null))
            val userInfo = userInfoRepository.getUserInfo().map { it.toUserInfo() }
            emit(Resource.Success(userInfo))
        } catch (e : HttpException) {
           emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured", null))
        } catch (e : IOException) {
           emit(Resource.Error("Could n't reach server. Check your internet connection",null))
        }
    }
}