package com.iniyan.cache

import android.content.Context
import io.paperdb.Paper


object CacheLibrary {
    fun init(context: Context) = Paper.init(context)
}
