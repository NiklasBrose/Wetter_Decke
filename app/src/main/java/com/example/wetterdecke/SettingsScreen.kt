package com.example.wetterdecke

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.unit.dp

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen(
    modifier: Modifier = Modifier,
){
    Column (modifier = modifier){
        Box(modifier = modifier
            .padding(20.dp)
            .size(250.dp)
            .clip(CircleShape)
            .background(Color.LightGray)
            .align(Alignment.CenterHorizontally)
            .border(10.dp, Color.Black, CircleShape)
        ){
            Text(modifier = Modifier.align(Alignment.Center),
                text = "Settings\n\n", color = Color.Black, fontSize = 30.sp)
            Text(modifier = Modifier.align(Alignment.Center),
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
        ){
        }
    }
}
