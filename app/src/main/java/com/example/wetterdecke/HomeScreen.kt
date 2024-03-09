package com.example.wetterdecke

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
){
    val TempList = getTemp()
    var zahl = TempList.size
    var datum = TempList[zahl-1]
    var Datum by remember { mutableStateOf("\n\n\n${datum.datum}") }
    var Temperatur by remember { mutableStateOf("\n${datum.temp}") }
    Column (modifier = modifier.fillMaxSize()){
        Box(modifier = modifier
            .padding(top = 60.dp)
            .size(300.dp)
            .clip(CircleShape)
            .background(Color.Gray)
            .align(Alignment.CenterHorizontally)
        ){
            Text(modifier = Modifier.align(Alignment.TopCenter),
                text = Datum, color = Color.Black, fontSize = 40.sp)
            Text(modifier = Modifier.align(Alignment.Center),
                text = Temperatur, color = Color.Black, fontSize = 50.sp, fontWeight = FontWeight.Bold
            )
        }
        val zahl = Math.round(datum.temp)
        Box(modifier = modifier
            .padding(top = 20.dp)
            .size(250.dp, 80.dp)
            .background(Color(getTempColor1(zahl = zahl),getTempColor2(zahl = zahl),getTempColor3(
                zahl = zahl)))
            .align(Alignment.CenterHorizontally)
            .border(3.dp, Color.Black)
        ){
        }
    }
}