package com.iniyan.navigation.features

import com.iniyan.navigation.core.Navigator

object OnboardingNavigation : Navigator() {
    fun intro() = fragmentIntent("com.iniyan.onboarding.IntroFragment")
}
