package com.example.wetterdecke

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wetterdecke.ui.theme.WetterDeckeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WetterDeckeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.LightGray
                ) {
                    Scaffold (modifier = Modifier, containerColor = Color.LightGray,){it
                        MyAppNavHost()
                    }
                 }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier,
               onNavigateToProfile: () -> Unit,){
    Column (modifier = modifier){
        Box(modifier = modifier
            .padding(20.dp)
            .size(250.dp)
            .clip(CircleShape)
            .background(Color.LightGray)
            .align(Alignment.CenterHorizontally)
            .border(10.dp, Color.Black, CircleShape)
        ){
            Text(modifier =Modifier.align(Alignment.Center),
                text = "2024-01-27\n\n", color = Color.Black, fontSize = 30.sp)
            Text(modifier =Modifier.align(Alignment.Center),
                text = "\n\n10,12°C", color = Color.Black, fontSize = 40.sp)
        }
        Box(modifier = modifier
            .padding(20.dp)
            .background(Color.LightGray)
            .align(Alignment.CenterHorizontally)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "Die Aktuelle Farbe: ", color = Color.Black,
            )
        }
        Box(modifier = modifier
            .size(250.dp, 80.dp)
            .background(Color(137, 58, 29))
            .align(Alignment.CenterHorizontally)
            .border(3.dp, Color.Black)
        )
        Button(onClick = onNavigateToProfile) {
            Text(text = "Gestern")
        }
    }
}

@Composable
fun MyAppNavHost(
    modifier: Modifier = Modifier,
) {
    val navController: NavHostController = rememberNavController()
    val startDestination: String = "profile"
    NavHost(
        modifier = Modifier.fillMaxSize(),
        navController = navController,
        startDestination = startDestination
    ) {
        composable("profile") {
            ProfileScreen(
                onNavigateToFriends = { navController.navigate("Home") },
            )
        }
        composable("Home") {
            HomeScreen(
                onNavigateToProfile = { navController.navigate("profile") },
            )
        }
    }
}

@Composable
fun ProfileScreen(
    onNavigateToFriends: () -> Unit,
) {
    Column {
        Box(modifier = Modifier
            .padding(20.dp)
            .size(250.dp)
            .clip(CircleShape)
            .background(Color.LightGray)
            .align(Alignment.CenterHorizontally)
            .border(10.dp, Color.Black, CircleShape)
        ){
            Text(modifier =Modifier.align(Alignment.Center),
                text = "2024-01-25\n\n", color = Color.Black, fontSize = 30.sp)
            Text(modifier =Modifier.align(Alignment.Center),
                text = "\n\n9°C", color = Color.Black, fontSize = 40.sp)
        }
        Box(modifier = Modifier
            .padding(20.dp)
            .background(Color.LightGray)
            .align(Alignment.CenterHorizontally)
        ) {
            Text(
                modifier = Modifier.align(Alignment.Center),
                text = "Die Aktuelle Farbe: ", color = Color.Black,
            )
        }
        Box(modifier = Modifier
            .size(250.dp, 80.dp)
            .background(Color(137, 132, 25))
            .align(Alignment.CenterHorizontally)
            .border(3.dp, Color.Black)
        )
        Button(onClick = onNavigateToFriends) {
            Text(text = "Heute")
        }
    }
}