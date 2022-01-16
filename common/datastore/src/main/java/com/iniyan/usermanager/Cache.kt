package com.iniyan.usermanager

import androidx.lifecycle.LiveData
import io.paperdb.Book
import io.paperdb.Paper

class Cache {

    fun <T> load(key: String): LiveData<T> = Paper.book().read(key)

    fun <T> save(key: String, data: T): Book? = Paper.book().write(key, data)

    fun delete(key: String) = Paper.book().delete(key)

    fun <T> get(key: String): T? = Paper.book().read(key)

    fun <T> set(key: String, data: T) = Paper.book().write(key, data).let { Unit }

    fun remove(key: String) = Paper.book().delete(key)
}
