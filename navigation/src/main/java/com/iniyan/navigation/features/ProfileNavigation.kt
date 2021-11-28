package com.iniyan.navigation.features

import com.iniyan.navigation.core.Navigator


object ProfileNavigation : Navigator() {
    fun profile() = fragment("com.iniyan.profile.ProfileFragment")
}
