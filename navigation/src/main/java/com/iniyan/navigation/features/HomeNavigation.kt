package com.iniyan.navigation.features

import android.content.Intent
import com.iniyan.navigation.core.Navigator

object HomeNavigation : Navigator() {
    fun home() = fragmentIntent("com.iniyan.home.HomeFragment")
        .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
}
