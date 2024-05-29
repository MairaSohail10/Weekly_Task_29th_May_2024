package com.example.typesafenavigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute

//fun NavGraphBuilder.mainGraph(navController: NavController) {
//    composable<Route.Home> {
//        HomeScreen {
//            navController.navigate(
//                Route.Profile(
//                    it.name,
//                    it.age
//                )
//            )
//        }
//    }
//
//    composable<Route.Profile> { backStackEntry ->
//        val profile: Route.Profile = backStackEntry.toRoute()
//        //val args= it.toRoute<Profile>()
//        ProfileScreen(
//            profile = profile
//        )
//    }
//}