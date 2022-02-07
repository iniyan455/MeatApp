package com.iniyan.meat

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.iniyan.meat.presentation.ui.SplashViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {

    private val splashViewModel: SplashViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // startActivity( use this to move using navigation component)

//        when {
//            UserManager().newUser -> startActivity(OnboardingNavigation.intro())
//            else -> startActivity(HomeNavigation.home())
//        }
//        finish()
    }
}
