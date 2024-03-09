package com.example.wetterdecke

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TempDataScreen(
    modifier: Modifier = Modifier,
){
    val TempList = getTemp()

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {
        Text(
            text = "Temp Data",
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 15.dp),
            fontSize = 42.sp,
        )
        TempList.forEachIndexed { index, item ->
            Row {
                val zahl = Math.round(item.temp)
                Box(modifier= Modifier
                    .padding(start = 42.dp, top = 15.dp)
                    .size(90.dp, 20.dp)
                    .background(Color.Transparent)
                ){
                    Text(text = item.datum)
                }
                Box(modifier= Modifier
                    .padding(start = 42.dp, top = 15.dp)
                    .size(50.dp, 20.dp)
                    .background(Color.Transparent)
                ){
                    Text(text = "$zahl°C")
                }
                Box(modifier = modifier
                    .padding(start = 42.dp, top = 15.dp)
                    .size(90.dp, 42.dp)
                    .background(Color(getTempColor1(zahl = zahl),getTempColor2(zahl = zahl),getTempColor3(
                        zahl = zahl)))
                    .border(3.dp, Color.Black)
                ){
                }
            }
        }
    }
}

