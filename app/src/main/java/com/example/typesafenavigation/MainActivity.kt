package com.example.typesafenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.example.typesafenavigation.ui.theme.TypeSafeNavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TypeSafeNavigationTheme {

                Column(Modifier
                    .fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally)
                {

                    /*
                     Time Complexity is O(n) as we visit all the characters in the string once.

                     Space Complexity depends on the size of the character set. So,
                     Space Complexity is O(min(n,m)) when storing unique characters in the set,
                     in worst case scenario it is o(n) as all the characters could be unique
                     and character set size and size of string become equal.

                     n is the size of the string.
                     m is the size of the character set.

                    */

                    Text(text = lengthOfLongestSubstring("ABCDEFGABEF").toString())
                }
//                val navController= rememberNavController()
//                NavHost(
//                    navController = navController,
//                    startDestination = Route.Home
//                )
//                {
//                    mainGraph(navController)
//                }
            }
        }
    }
}

//@Composable
//fun HomeScreen(onClick: (Route.Profile) -> Unit) {
//    Column(modifier= Modifier
//        .fillMaxSize()
//        .background(Color.Gray),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally)
//    {
//        Button(onClick = {onClick(Route.Profile("maira", "22"))})
//        {
//            Text("Navigate to Profile Screen")
//        }
//    }
//}
//
//@Composable
//fun ProfileScreen(profile: Route.Profile) {
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color.White),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    )
//    {
//        Text(text = "${profile.name} & ${profile.age} years old")
//    }
//}


fun lengthOfLongestSubstring(str: String):Int{

    //to keep track of longest substring
    var longestLength=0

    //to keep track of start of longest substring
    var left=0


    //set to store unique characters
    val charSet= mutableSetOf<Char>()


    for(r in str.indices)
    {
        //If the current character is already in the set,
        //move the left pointer to the right until the
        //current character is removed from the set
        while(str[r] in charSet)
        {
            charSet.remove(str[r])
            left++
        }

        //Add the current character to the set
        charSet.add(str[r])


        //Update the longest length if the current substring
        //is longer than the previous longest substring
        longestLength= maxOf(longestLength , charSet.size)

    }
    return longestLength
}