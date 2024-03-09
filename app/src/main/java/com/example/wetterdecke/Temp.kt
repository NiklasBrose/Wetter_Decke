package com.example.wetterdecke

import androidx.compose.runtime.Composable

data class Temp(val datum: String, val temp: Double) {}

@Composable
fun getTemp(): List<Temp> {
    val list= arrayListOf<Temp>()

    list.add(Temp("2023-10-25",14.4))
    list.add(Temp("2023-10-26",10.4))
    list.add(Temp("2023-10-27",10.36))
    list.add(Temp("2023-10-28",11.6))
    list.add(Temp("2023-10-29",15.7))
    list.add(Temp("2023-10-30",16.4))
    list.add(Temp("2023-10-31",11.8))
    list.add(Temp("2023-11-01",13.9))
    list.add(Temp("2023-11-02",12.5))
    list.add(Temp("2023-11-03",12.1))
    list.add(Temp("2023-11-04",11.3))
    list.add(Temp("2023-11-05",11.7))
    list.add(Temp("2023-11-06",13.1))
    list.add(Temp("2023-11-07",12.0))
    list.add(Temp("2023-11-08",11.1))
    list.add(Temp("2023-11-09",10.5))
    list.add(Temp("2023-11-10",10.1))
    list.add(Temp("2023-11-11",7.7))
    list.add(Temp("2023-11-12",8.3))
    list.add(Temp("2023-11-13",9.0))
    list.add(Temp("2023-11-14",13.5))
    list.add(Temp("2023-11-15",9.6))
    list.add(Temp("2023-11-16",7.7))
    list.add(Temp("2023-11-17",6.6))
    list.add(Temp("2023-11-18",6.4))
    list.add(Temp("2023-11-19",12.8))
    list.add(Temp("2023-11-20",10.3))
    list.add(Temp("2023-11-21",6.1))
    list.add(Temp("2023-11-22",1.1))
    list.add(Temp("2023-11-23",7.9))
    list.add(Temp("2023-11-24",3.6))
    list.add(Temp("2023-11-25",1.4))
    list.add(Temp("2023-11-26",1.3))
    list.add(Temp("2023-11-27",2.0))
    list.add(Temp("2023-11-28",0.7))
    list.add(Temp("2023-11-29",-1.0))
    list.add(Temp("2023-11-30",-1.0))

    return list
}

@Composable
fun getTempColor1(zahl: Long): Int {
    var colordata = 107

    if (zahl >= 35){
        colordata =107
    }else if (zahl in 30..34){
        colordata =231
    }else if (zahl in 25..29){
        colordata =255
    }else if (zahl in 20..24){
        colordata =255
    }else if (zahl in 15..19){
        colordata =255
    }else if (zahl in 10..14){
        colordata =182
    }else if (zahl in 5..9){
        colordata =0
    }else if (zahl in 0..4){
        colordata =115
    }else if (zahl in -5..-1){
        colordata =89
    }else if (zahl in -10..-6){
        colordata =0
    }else {
        colordata =0
    }
    return colordata
}

@Composable
fun getTempColor2(zahl: Long): Int {
    var colordata = 0

    if (zahl >= 35){
        colordata =0
    }else if (zahl in 30..34){
        colordata =15
    }else if (zahl in 25..29){
        colordata =119
    }else if (zahl in 20..24){
        colordata =242
    }else if (zahl in 15..19){
        colordata =240
    }else if (zahl in 10..14){
        colordata =255
    }else if (zahl in 5..9){
        colordata =104
    }else if (zahl in 0..4){
        colordata =182
    }else if (zahl in -5..-1){
        colordata =91
    }else if (zahl in -10..-6){
        colordata =66
    }else {
        colordata =16
    }
    return colordata
}

@Composable
fun getTempColor3(zahl: Long): Int {
    var colordata = 0

    if (zahl >= 35){
        colordata =0
    }else if (zahl in 30..34){
        colordata =15
    }else if (zahl in 25..29){
        colordata =0
    }else if (zahl in 20..24){
        colordata =0
    }else if (zahl in 15..19){
        colordata =140
    }else if (zahl in 10..14){
        colordata =99
    }else if (zahl in 5..9){
        colordata =5
    }else if (zahl in 0..4){
        colordata =255
    }else if (zahl in -5..-1){
        colordata =228
    }else if (zahl in -10..-6){
        colordata =197
    }else {
        colordata =99
    }
    return colordata
}