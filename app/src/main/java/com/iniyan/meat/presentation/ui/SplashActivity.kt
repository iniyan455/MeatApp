package com.iniyan.meat.presentation.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.iniyan.meat.R
import com.iniyan.navigation.features.HomeNavigation
import com.iniyan.navigation.features.OnboardingNavigation
import com.iniyan.usermanager.UserManager
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        when {
            UserManager().newUser -> startActivity(OnboardingNavigation.intro())
            else -> startActivity(HomeNavigation.home())
        }
        finish()
    }
}