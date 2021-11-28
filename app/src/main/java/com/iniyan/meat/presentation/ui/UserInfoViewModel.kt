import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.iniyan.common.utitiles.util.Constants
import com.iniyan.common.utitiles.util.Resource
import com.iniyan.meat.domain.model.UserInfoState
import com.iniyan.meat.domain.usecase.GetUserInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

// Just main our state ui state when configuration changes happen less business logic
@HiltViewModel
class UserInfoViewModel @Inject constructor(
    private val getUserInfoUseCase: GetUserInfoUseCase,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _state = mutableStateOf(UserInfoState())
    val  state : State<UserInfoState> = _state

    init {
        savedStateHandle.get<String>(Constants.PARAM_USER_ID)?.let {
            getUserId(it)
        }
        getUserInfo()
    }

    private fun getUserInfo() {
        getUserInfoUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = UserInfoState(userInfo = result.data ?: emptyList())
                }

                is Resource.Error -> {
                    _state.value =
                        UserInfoState(error = result.message ?: "An UnExpected Error Occured")
                }

                is Resource.Loading -> {
                    _state.value = UserInfoState(isLoading = true)
                }

            }
        }.launchIn(viewModelScope)
    }

    private fun getUserId(id : String) {

    }
}