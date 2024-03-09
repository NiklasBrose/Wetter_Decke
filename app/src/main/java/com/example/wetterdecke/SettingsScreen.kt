package com.example.wetterdecke

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SettingsScreen(
    modifier: Modifier = Modifier,
){
    Column (modifier = Modifier
        .fillMaxSize()){
        Text(text = "Settings",
        modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .padding(top = 15.dp),
        fontSize = 42.sp,
        )
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "+35°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 100.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(107, 0, 0)),
                shape = RectangleShape,
                ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "30°C bis 34°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(231, 15, 15)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "25°C bis 29°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(255, 119, 0)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "20°C bis 24°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(255, 242, 0)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "15°C bis 19°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(255, 240, 140)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "10°C bis 14°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(182, 255, 99)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "5°C bis 9°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 60.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(0, 104, 5)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "0°C bis 4°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 60.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(115, 182, 255)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "-5°C bis -1°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 50.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(89, 91, 228)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier
            .padding(top = 15.dp),
            verticalAlignment = Alignment.CenterVertically){
            Text(text = "-10°C bis -6°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 42.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(0, 66, 197)),
                shape = RectangleShape,
            ) {
            }
        }
        Row (modifier = Modifier.padding(top = 15.dp)){
            Text(text = "-11°C",
                modifier = Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 42.dp)
                    .padding(end = 105.dp))
            Button(onClick = { /*TODO*/ },
                modifier = Modifier
                    .height(42.dp)
                    .width(180.dp)
                    .align(Alignment.CenterVertically),
                colors = ButtonDefaults.buttonColors(Color(0, 16, 99)),
                shape = RectangleShape,
            ) {
            }
        }
    }
}
