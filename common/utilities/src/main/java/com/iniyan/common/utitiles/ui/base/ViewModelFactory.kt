package com.iniyan.common.utitiles.ui.base


import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory<T>(private val apiHelper: T) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
//            return MainViewModel(MainRepository(apiHelper)) as T
//        }
        throw IllegalArgumentException("Unknown class name")
    }


}
//
//fun <T: ViewModel> T.createFactory(private val model : T): ViewModelProvider.Factory {
//    val viewModel = this
//    return object: ViewModelProvider.Factory {
//        @Suppress("UNCHECKED_CAST")
//        override fun <T: ViewModel> create(modelClass: Class<T>): T = viewModel as T
//    }
//}