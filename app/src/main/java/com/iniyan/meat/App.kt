package com.iniyan.meat

import android.app.Application
import com.iniyan.common.utitiles.util.* // ktlint-disable no-wildcard-imports
import com.iniyan.usermanager.CacheLibrary
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()
        if (BuildConfig.DEBUG) Timber.plant(Timber.DebugTree())
        registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks())
        CacheLibrary.init(this)
    }
}
