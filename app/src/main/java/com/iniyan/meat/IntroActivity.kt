package com.iniyan.meat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class IntroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()

        setContentView(R.layout.activity_splash)
//        when {
//            UserManager().newUser -> startActivity(OnboardingNavigation.intro())
//            else -> startActivity(HomeNavigation.home())
//        }
//        finish()
    }
}