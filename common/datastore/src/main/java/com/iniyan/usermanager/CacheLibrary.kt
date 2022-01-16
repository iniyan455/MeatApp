package com.iniyan.usermanager

import android.content.Context
import io.paperdb.Paper


object CacheLibrary {
    fun init(context: Context) = Paper.init(context)
}
