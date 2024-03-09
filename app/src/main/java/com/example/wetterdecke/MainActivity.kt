package com.example.wetterdecke

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.List
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
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
                    Bottombar()
                }
            }
        }
    }
}

data class NavigationBottomBarData(val label:String, val id: ImageVector)


@Composable
private fun getNavigationBarItems():List<NavigationBottomBarData> {
    val list=arrayListOf<NavigationBottomBarData>()

    list.add( NavigationBottomBarData(stringResource(id = R.string.tempdatascreen), Icons.AutoMirrored.Filled.List
    ))

    list.add( NavigationBottomBarData(stringResource(id = R.string.homescreen),Icons.Filled.Home
    ))

    list.add( NavigationBottomBarData(stringResource(id = R.string.settingsscreen),Icons.Filled.Settings
    ))

    return list
}  // getNavigationBarItems

@Composable
fun Bottombar() {
    val navigationBottomBarDataList = getNavigationBarItems()
    val selectedItemIndex = remember { mutableStateOf( 1 ) }

    val bottombarColors = NavigationBarItemDefaults.colors(
        Color.Black,  // selected Icon Color
        Color.Black, // selected Text Color
        Color.Unspecified, // indicatorColor
        Color.DarkGray, // unselected Icon Color
        Color.White // unselected Text Color
    )

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .padding(bottom = 76.dp) // Bereich der Bottombar
                .fillMaxSize()
        ){
            // switch case der Fragmente
            when (selectedItemIndex.value) {
                0 -> TempDataScreen()
                1 -> HomeScreen()
                2 -> SettingsScreen()
                else -> Text("Fehlerhafte when-Anweisung(selectedItemIndex): "+   selectedItemIndex.value)
            }  // when

        } // Column
        NavigationBar(
            modifier = Modifier
                .padding(8.dp)
                .align(alignment = Alignment.BottomCenter),
            containerColor = Color.Gray
        ) {
            // for loop über alle Schalter
            navigationBottomBarDataList.forEachIndexed{ index, item ->
                NavigationBarItem(
                    label={
                        Text(item.label)
                    },
                    colors=bottombarColors,
                    selected = selectedItemIndex.value==index,
                    onClick = {
                        selectedItemIndex.value=index
                    },
                    icon = {
                        Icon(item.id,
                            contentDescription = ""
                        )
                    }
                )  // NavigationBarItem

            } // forEachIndexed
        }
    }  // Box
}