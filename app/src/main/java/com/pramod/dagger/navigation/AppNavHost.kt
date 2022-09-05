package com.pramod.dagger.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.pramod.dagger.ui.LoginScreen
import com.pramod.dagger.ui.SignupScreen
import com.pramod.dagger.ui.home.HomeScreen
import com.pramod.dagger.viewmodel.AuthViewModel






@Composable
 fun AppNavHost(
    viewModel: AuthViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUTE_LOGIN
){

    NavHost(modifier = Modifier,
    navController = navController,
        startDestination = startDestination

    ){
        composable(ROUTE_LOGIN){
            LoginScreen(viewModel, navController)

        }

        composable(ROUTE_SIGNUP){
            SignupScreen(viewModel, navController)

        }
        composable(ROUTE_HOME){
            HomeScreen(viewModel, navController)

        }
    }

}