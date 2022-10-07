package com.example.jetpack

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.detectDragGesturesAfterLongPress
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
                ListItem("Dude 1", "Android Dev")
                ListItem("Dude 2", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
                ListItem("Dude 3", "Android Dev")
            }

        }
    }
}


@Composable
private fun ListItem(name: String, profession: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
            .pointerInput(Unit) {
                detectTapGestures{
                    Log.d("test_msg", "Long press: $it")
                }
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 5.dp
        ) {
        
        Box() {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_background),
                    contentDescription = "image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(5.dp)
                        .size(64.dp)
                        .clip(CircleShape)
                )
                
                Column() {
                    Text(text = name)
                    Text(text = profession)
                }

            }

        }
        
    }
}


@Composable
fun ShowFigure() {
    Row(
        modifier = Modifier
            .background(Color.Magenta)
            .fillMaxWidth()
            .fillMaxHeight(0.5f),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Android")
            Text(text = "Again")
        }

        Column(
            modifier = Modifier
                .background(Color.LightGray)
                .fillMaxSize(),
            verticalArrangement = Arrangement.SpaceAround,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Hello")
            Text(text = "Android")
            Text(text = "Again")
        }
    }
}