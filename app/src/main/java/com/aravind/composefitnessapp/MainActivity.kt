package com.aravind.composefitnessapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.aravind.composefitnessapp.ui.screen.Screen
import com.aravind.composefitnessapp.ui.screen.getstarted.GetStartedScreen
import com.aravind.composefitnessapp.ui.screen.onboarding.OnBoardingScreen
import com.aravind.composefitnessapp.ui.screen.registeruser.RegisterUser
import com.aravind.composefitnessapp.ui.theme.ComposeFitnessAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            ComposeFitnessAppTheme {
                NavHost(navController = navController, startDestination = Screen.GetStarted.route) {
                    composable(Screen.GetStarted.route) {
                        GetStartedScreen(onGetStarted = {navController.navigate(Screen.OnBoarding.route)})
                    }
                    composable(Screen.OnBoarding.route) {
                        OnBoardingScreen(onBoardingFinished = {navController.navigate(Screen.RegisterUser.route)})
                    }
                    composable(Screen.RegisterUser.route) {
                        RegisterUser()
                    }
                }

            }
        }
    }
}
