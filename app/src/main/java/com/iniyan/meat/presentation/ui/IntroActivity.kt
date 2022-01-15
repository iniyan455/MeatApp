package com.iniyan.meat.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.iniyan.meat.R
import com.iniyan.navigation.features.HomeNavigation
import com.iniyan.navigation.features.OnboardingNavigation
import com.iniyan.usermanager.UserManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()

        setContentView(R.layout.activity_splash)
        when {
            UserManager().newUser -> startActivity(OnboardingNavigation.intro())
            else -> startActivity(HomeNavigation.home())
        }
        finish()
    }
}