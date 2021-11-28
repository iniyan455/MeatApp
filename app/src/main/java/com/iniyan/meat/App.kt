package com.iniyan.meat

import android.app.Application
import com.airbnb.mvrx.Mavericks
import com.airbnb.mvrx.MavericksViewModelConfigFactory
import com.iniyan.cache.CacheLibrary
import timber.log.Timber
import com.iniyan.common.utitiles.util.*
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks())
        Mavericks.viewModelConfigFactory = MavericksViewModelConfigFactory(applicationContext)
        CacheLibrary.init(this)
    }
}
