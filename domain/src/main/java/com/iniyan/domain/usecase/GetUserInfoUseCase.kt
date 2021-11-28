package com.iniyan.domain.usecase

import com.iniyan.data.dto.toUserInfo
import com.iniyan.domain.common.Resource
import com.iniyan.domain.model.UserInfo
import com.iniyan.domain.repository.UserInfoRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetUserInfoUseCase @Inject constructor(
    private val userInfoRepository : UserInfoRepository
) {
    /** We want to emit multiple values over a period of time for loading usecases we need to emit status - success,failure */
    operator fun invoke() : Flow<Resource<out List<UserInfo>>> = flow {
        try {
            emit(Resource.Loading())
            val userInfo = userInfoRepository.getUserInfo().map { it.toUserInfo() }
            emit(Resource.Success(userInfo))
        } catch (e : HttpException) {
           emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e : IOException) {
           emit(Resource.Error("Could n't reach server. Check your internet connection"))
        }
    }
}